public class topic25 {
    public static void main(String[] args) {
        //m=Math.random输出【0，1）之间的随机数  double类型
        int x = (int)(Math.random()*10);//生成【0，9】之间的随机整数
        System.out.println(x);
    }
    //自己想了想如何生成不重复的呢，可以用到arraylist集合，利用contains方法判断集合中是否存在这个数字
}
