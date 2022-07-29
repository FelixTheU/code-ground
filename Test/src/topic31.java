import java.util.Scanner;

public class topic31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个四位数");
        int x = scanner.nextInt();
        int[] s = new int[4];
        int shuzi = x;
        //将数字拆分进数组，并且这时是逆序进入数组，同时完成换位
        for(int i = 0 ; i<4;i++){
            s[i]=shuzi%10;
            shuzi=shuzi/10;
        }
        //用另一个数组存放加密后的数字
        int[] y = new int[4];
        for(int j = 0 ;j<4;j++){
            y[j]=(s[j]+5+s[j])%10;
        }
        System.out.println("加密后的整数为:");
        //用增强for循环打印数组
        for (int shuzu:y){
            System.out.print(shuzu);
        }
    }
}
