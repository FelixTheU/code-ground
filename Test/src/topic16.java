public class topic16 {
    public static void main(String[] args) {
        double h =100;
        double sum = 0;
        for(int i = 1;i<=10;i++){
            sum=h+(h/2)+sum;//一次落地距离加+弹起距离+之前走过的距离
            h=h/2;//高度减半
        }
        sum-=h;//求第10次落地经过路程需减去第10次弹起距离
        System.out.println("小球经过的距离为"+sum+"\t小球此时高度为"+h);
    }

}
