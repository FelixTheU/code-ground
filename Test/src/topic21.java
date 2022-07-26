import java.util.Scanner;

public class topic21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个不多于5位数的数字");
        int x = scanner.nextInt();
        int k = 1;
        int y=x;
        if(x<0||x>99999){
            System.out.println("输入数字有误");
            return;
        }else {
            while (x / 10 != 0) {
                k += 1;
                x = x / 10;
            }
        }
        System.out.println("这是一个"+k+"位数");
        System.out.print("逆序输出为:");
        for(int i =0;i<k;i++){
            int j = y%10;
            y/=10;
            System.out.print(j);
        }
    }
}
