import java.io.*;
import java.util.Arrays;

//暂时想到这么做，没有想到更好的方法了
public class topic34 {
    public static void main(String[] args) throws Exception{
        BufferedReader br1 = new BufferedReader(new FileReader("d:/A.txt"));
        BufferedReader br2 = new BufferedReader(new FileReader("d:/B.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("d:/C.txt"));
        StringBuilder stringBuilder = new StringBuilder("");
        String temp = "";
        while ((temp=br1.readLine())!=null){
            stringBuilder.append(temp);
        }
        while ((temp=br2.readLine())!=null){
            stringBuilder.append(temp);
        }
        String str = new String(stringBuilder);
        char[] sc = str.toCharArray();
        Arrays.sort(sc);
        bw.write(sc);
        System.out.println(sc);
        bw.flush();
        bw.close();
        br1.close();
        br2.close();
    }
}
