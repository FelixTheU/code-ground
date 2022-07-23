public class topic10 {
    public static void main(String[] args) {
        int count = 0;
        for(int i =100;i<=200;i++){
            for(int j =2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    System.out.println(i);
                    count++;
                    break;
                }
            }
            }
        System.out.println(count);
    }
}
