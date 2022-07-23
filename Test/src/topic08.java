public class topic08 {
    public static void main(String[] args)  {
        System.out.println("Hello");
        try {
            Thread.sleep(5000);
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
