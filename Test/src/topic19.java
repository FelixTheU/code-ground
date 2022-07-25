
public class topic19 {
    public static void main(String[] args) {
        int ret = jiechen(20);
        System.out.println(ret);
    }
    public static  int jiechen(int x){
        int sum =0;
        for(int i =1;i<=x;i++){
            int jie = 1;
            for(int j =i;j>0;j--){
                jie = jie*j;
            }
            sum+=jie;
        }
        return sum;
    }
}

