public class topic20 {
    public static  void digui(String str,int length){
        if(length==0)
            return ;
        System.out.print(str.charAt(length-1));
        digui(str,length-1);
    }

    public static void main(String[] args) {
        String str ="jkl";
        digui(str,str.length());
    }
}
