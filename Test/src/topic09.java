import java.text.SimpleDateFormat;
import java.util.Date;

public class topic09 {
    public static void main(String[] args)  {
        System.out.println("Hello");
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Thread.sleep(5000);
            System.out.println(simpleDateFormat.format(date));
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
