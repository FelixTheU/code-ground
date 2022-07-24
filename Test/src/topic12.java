import java.util.Scanner;

public class topic12 {
    public  static  void fenjie(int num){
        int k =2;
        StringBuilder str = new StringBuilder().append(num).append("=");
        while(num>=k){
            if(num==k){
                str.append(k);
                break;
            }else if(num%k==0){
                str.append(k).append("*");
                num=num/k;
            }else{
                k++;
            }
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int x =scanner.nextInt();
        fenjie(x);
    }
}
