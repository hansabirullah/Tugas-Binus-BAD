public class F6T1_ExceptionPembagian0 {
    public static void main(String[] args) {
        System.out.println("Starting Program");
        int a = 2;
        try {
            a = a/0;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Eror karena pembagian nol");
        }
        System.out.println(a);
        System.out.println("End Program");
    }
}
