public class Membalik_SusunanString {
    public static void main(String[] args) {
        String string="abcdegf";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("\nString before reverse: "+string);
        System.out.println("String after reverse: "+reverse);
    }
}
