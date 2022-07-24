import java.util.Scanner;

public class topic14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int a = 0;//记录英文的个数
        int b = 0;//记录数字的个数
        int c = 0;//记录空格的个数
        int d = 0;//记录其他字符的个数
        char[] sc = str.toCharArray();
        for(int i =0;i<sc.length;i++){
            if('A'<=sc[i]&&'Z'>=sc[i]||'a'<=sc[i]&&'z'>=sc[i]){
                a++;
            }else if('0'<=sc[i]&&'9'>=sc[i]){
                b++;
            }else if(' '==sc[i]){
                c++;
            }else {
                d++;
            }
        }
        System.out.println("英文的个数为"+a+"\t数字的个数为"+b+"\t空格的个数为"+c+"\t其他字符的个数为"+d);
    }
}
