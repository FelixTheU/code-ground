import java.util.Scanner;

public class topic04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入x");
        int x = scanner.nextInt();
        System.out.println("输入y");
        int y = scanner.nextInt();
        System.out.println("输入z");
        int z = scanner.nextInt();

        //找到最大值
        int max = x>y? x:y;
        max = max>z? max:z;
        //找到最小值
        int min = x<y? x:y;
        min = min<z? min:z;
        //找到中间值
        int mid = x+y+z-max-min;

        System.out.println("x,y,z的大小顺序为:"+min+"\t"+mid+"\t"+max);
    }
}
