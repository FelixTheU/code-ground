public class topic01 {
    public static void main(String[] args) {
        int sum=0;
        for(int i =100;i<433;i++){
            //记录三位数的位数
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/100%100;
            if(ge<=4&&shi<=4&&bai<=4&&ge>=1&&shi>=1&&bai>=1){
                if(ge!=shi&&ge!=bai&&shi!=bai)
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
