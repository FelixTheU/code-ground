import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class topic33 {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String STR = str.toUpperCase();
       try {
           bw = new BufferedWriter(new FileWriter("d:/test.txt",true));
           bw.write(STR);
       }catch (Exception e){
           e.printStackTrace();
       }finally {
           try {
               if(bw!=null){
                   bw.close();
               }
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
    }
}
