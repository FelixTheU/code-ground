/**
 * 设这个整数为num
 * num+100=i*i
 * num+268=j*j
 * (j+i)*(j-i)=168
 * 得到j>i并且j+i最大为168
 */

public class topic02 {
    public static void main(String[] args) {
        for(int i = 0;i<168;i++){
            for(int j = i+1;j<168;j++){
                if((j+i)*(j-i)==168){
                    //输出num
                    System.out.println((i*i-100));
                }
            }
        }
    }
}
