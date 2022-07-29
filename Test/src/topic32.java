import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class topic32 {
    //这个题目暂时想到这么写，没能展现动态的输入#停止
    public static void main(String[] args) {
        BufferedWriter bw = null;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        try {
            bw = new BufferedWriter(new FileWriter("d:/test2.txt",true));
            char[] sc = str.toCharArray();
            for(int i =0;i<sc.length;i++){
                if(sc[i]!='#') {
                    bw.write(sc[i]);
                }else {
                    break;
                }
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bw!= null){
                    bw.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
