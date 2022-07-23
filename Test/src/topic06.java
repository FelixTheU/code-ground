import java.util.Arrays;

public class topic06 {
    public static void main(String[] args) {
        int[] a =new int[]{2,3};
        int[] b = new int[2];
        for(int i =0;i<a.length;i++){
            b[i]=a[i];
        }
        System.out.println(Arrays.toString(b));
    }
    //我也不知道这样可不可以，还是说需要用到arraylist集合

}
