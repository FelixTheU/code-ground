import java.util.Scanner;

public class topic29 {
    public static double shuzi(int n){
        double sum = 0;
        if(n%2==0){
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    sum=sum+1.0/i;
                }
            }
            return sum;
        }else{
            for(int i=1;i<=n;i++){
                if((i%2)!=0){
                    sum=sum+1.0/i;
                }
            }
            return sum;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x =scanner.nextInt();
        System.out.println(shuzi(x));
    }
}
