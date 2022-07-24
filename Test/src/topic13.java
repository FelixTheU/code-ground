import java.util.Scanner;

public class topic13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入学生的分数");
        int x= scanner.nextInt();
        char grades = ' ';
        if(x>=90){
            grades = 'A';
            System.out.println("学生的等级为"+grades);
        }else if(x>=60&&x<90){
            grades = 'B';
            System.out.println("学生的等级为"+grades);
        }else{
            grades = 'C';
            System.out.println("学生的等级为"+grades);
        }


    }
}
