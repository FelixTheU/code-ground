import java.util.Scanner;

public class topic27 {
    public static void main(String[] args){

        //实现键盘输入一串数字，并将其存储到数组中
        System.out.println("输入一个整数：");
        Scanner scanner=new Scanner(System.in);
        long num=scanner.nextLong();

        //将这一串数字转换为字符串类型
        String str=Long.toString(num);//把数字转化为String类型的
        char[]arr = str.toCharArray();



        //实现输出未排序前的数组元素
        System.out.println("变化前的数组：");
        for(int j = 0;j<=arr.length-1;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();



        //获取最大值
        int max =arr[0];
        for(int x =1;x<arr.length;x++){//注意这里不要越界
            if(arr[x]>max){
                max =arr[x];
            }
        }


        //获取最大值的索引
        int maxaddress = 0;
        for (int x = 0; x < arr.length; x++) {
            if (max==arr[x]) {
                maxaddress =x;
            }
        }


        //将最大的元素与第一个元素交换位置
        char temp =  arr[0];//把数组中的第一个元素赋值给暂存地temp
        arr[0] = arr[maxaddress];//把数组中的最大值赋值给数组中的第一个元素
        arr[maxaddress] = temp;//把数组中的第一个元素赋值给数组中的最大值的位置

        //实现输出数组元素
        System.out.println("最大的与第一个元素交换后的数组：");
        for(int j = 0;j<=arr.length-1;j++){//实现输出数组元素
            System.out.print(arr[j]+" ");
        }
        System.out.println();


        //获取最小值
        int min =arr[0];
        for(int x =1;x<arr.length;x++){//注意这里不要越界
            if(arr[x]<min){
                min =arr[x];
            }
        }
        //获取最小值的索引
        int minaddress = 0;
        for (int y = 0; y < arr.length; y++) {
            if (min==arr[y]) {
                minaddress =y;
            }
        }
        //System.out.println("min的索引为"+minaddress);



        //将最小的元素与最后一个元素交换位置
        char temp2 = arr[arr.length-1];//把数组中的最后一个元素赋值给暂存地temp2
        arr[arr.length-1] = arr[minaddress];//把数组中的最小值赋值给数组中的最后一个元素
        arr[minaddress] = temp2;//把数组中的最后一个元素赋值给数组中的最小值



        //实现输出数组元素
        System.out.println("最小的与最后一个元素交换后的数组：");
        for(int j = 0;j<=arr.length-1;j++){//实现输出数组元素
            System.out.print(arr[j]+" ");
        }


    }

}
