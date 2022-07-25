import java.util.Scanner;



public class topic18 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int x= scanner.nextInt();
        for(int i=x;i>0;i--){
            int row =2*i-1;//记录打印*的个数
            int k =-i+x;//记录打印空格的个数
            while (k>0){
                System.out.print(" ");
                k--;
            }
            while (row>0){
                System.out.print("*");
                row--;
            }

            System.out.println();

        }
    }
}
