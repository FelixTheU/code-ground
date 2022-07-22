import java.util.Scanner;

public class topic03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = scanner.nextInt();
        System.out.println("请输入月份");
        int month = scanner.nextInt();
        System.out.println("请输入日期");
        int day = scanner.nextInt();
        int Feb = 28;//记录二月的天数
        //能被4整除不能被100整除的年份是闰年，能被400整除的年份是闰年
        if((year%4==0&&year%100!=0)||year%400==0){
            Feb = 29;
        }
        int totalday = 0;
        int[] months={31,Feb,31,30,31,30,31,31,30,31,30,31};
        if(month>12||day>months[month-1]){
            System.out.println("输入格式不对，请重新输入！");
        }else if(month == 1){
            totalday = day;
        }else {
            for(int i=0;i<month-1;i++){
                totalday+=months[i];
            }
            totalday+=day;
            System.out.println(year+"年"+month+"月"+day+"日是"+year+"年第"+totalday+"天");
        }
    }
}
