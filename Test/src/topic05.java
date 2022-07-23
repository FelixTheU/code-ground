import java.util.Scanner;

public class topic05 {
    public  static int digui(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return digui(n-2)+digui(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i =1;i<=n;i++){
            System.out.print(digui(i)+" ");
        }
    }
}
