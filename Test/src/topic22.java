import java.util.Scanner;

public class topic22 {
    public static void main(String[] args) {
        System.out.println("请输入一个5位数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (9999 < num && num < 100000) {
            //判断这个数字的位数
            int num1 = num/10000;
            int num2 = num/1000%10;
            int num3 = num/100%10;
            int num4 = num/10%10;
            int num5 = num%10;
            if(num1 == num5 && num2 == num4) {
                System.out.println(num+"是回文数");
            }else {
                System.out.println(num+"不是回文数。");
            }
        }else {
            System.out.println("输入错误：请输入一个5位数");
        }
    }
}
