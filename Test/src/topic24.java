import java.util.Scanner;

public class topic24 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,3,5,7,9,11};
        int[] arr2 = new int[arr1.length+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个数字");
        int num = scanner.nextInt();
        int n = 0;
        for(int i =0;i<arr1.length;i++){//找到输入数在数组的位置
            if(arr1[i]>=num){
                n=i;
                break;
            }
            else {
                n=arr1.length;
            }
        }
        for(int j =0;j<arr2.length;j++){//给数组2赋值并输出
            if(j<n){
                arr2[j]=arr1[j];
            }else if(j==n){
                arr2[j]=num;
            }else {
                arr2[j]=arr1[j-1];
            }
            System.out.print(arr2[j]+" ");
        }
    }
}
