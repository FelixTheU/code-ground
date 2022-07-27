import java.util.Locale;
import java.util.Scanner;

public class topic23xu {
    /**
     * 第23题的另一种解法，上一个有点不符合需求
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期");
        String str = scanner.nextLine().toUpperCase();
        char[] sc = str.toCharArray();
        switch (sc[0]){
            case 'M':
                System.out.println("Monday:星期一");
                break;
            case 'W':
                System.out.println("Wednesday:星期三");
                break;
            case 'F':
                System.out.println("Friday:星期五");
                break;
            case 'T':
                if(sc[1]=='U'){
                    System.out.println("Tuesday:星期二");
                    break;
                }else if(sc[1]=='H'){
                    System.out.println("Thursday:星期四");
                    break;
                }else {
                    System.out.println("输入有误");
                    break;
                }
            case 'S':
                if(sc[1]=='A'){
                    System.out.println("Saturday:星期六");
                    break;
                }else if(sc[1]=='U'){
                    System.out.println("Sunday:星期天");
                    break;
                }else {
                    System.out.println("输入有误");
                    break;
                }
            default:
                System.out.println("输入有误");

        }
    }
}
