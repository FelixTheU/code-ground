import java.util.Scanner;

public class topic30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个八进制数");
        int x = scanner.nextInt();
        //Integer.parseInt方法用于进制的转换
        System.out.println(Integer.parseInt(String.valueOf(x),8));
    }
}
