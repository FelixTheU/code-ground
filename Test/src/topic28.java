import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class topic28 {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int num = scanner.nextInt();
        for(int i = 1 ; i <= num; i++){//将原来的号存入list
            list.add(i);
        }
        getItem(list,1);
    }
    public static void getItem(List<Integer> list,int index){
        List<Integer> tempList = new ArrayList<Integer>();//声明另外一个list集合，存放遍历后的人
        if(list.size()==1){//若集合大小为1，则是最后一人
            System.out.println("剩余的一个人是原来的第" + list.get(0) + "位");
            return ;
        }
        for(int i = 0 ; i < list.size() ; i++){//遍历集合
            if((index++) % 3!=0){
                tempList.add(list.get(i));//报号不为3的，添加进另一个集合
            }
        }
        getItem(tempList,index%3);//递归
    }
}
