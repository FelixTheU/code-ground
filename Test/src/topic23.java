import java.util.Scanner;

public class topic23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期的首字母（不区分大小写）：");
        String str1 = scanner.nextLine().toUpperCase();

        switch (str1) {
            case "M":
                System.out.println("Monday:星期一");
                break;
            case "T":
                System.out.println("请输入星期的次字母（不区分大小写）：");
                String str2 = scanner.nextLine().toUpperCase();
                if (str2.equals("U")) {
                    System.out.println("Tuesday:星期二");
                } else if (str2.equals("H")) {
                    System.out.println("Thursday:星期四");
                } else {
                    System.out.println("Wrong");
                }
                break;
            case "W":
                System.out.println("Wednesday:星期三");
                break;
            case "F":
                System.out.println("Friday:星期五");
                break;
            case "S":
                System.out.println("请输入星期的次字母（不区分大小写）：");
                String str3 = scanner.nextLine().toUpperCase();
                if (str3.equals("U")) {
                    System.out.println("Sunday:星期天");
                } else if (str3.equals("A")) {
                    System.out.println("Saturday:星期六");
                } else {
                    System.out.println("Wrong");
                }
                break;
            default:
                System.out.println("Wrong!");

        }
    }
}
