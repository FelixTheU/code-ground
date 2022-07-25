public class topic15 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            int num=0;
            for(int j =1;j<i;j++){
                if(i%j==0){
                    num+=j;
                }
            }
            if(num==i){
                System.out.println(i+"是一个完数");
            }
        }
    }
}
