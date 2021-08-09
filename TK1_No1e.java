public class TK1_No1e {
    public static void main(String[] args) {
        String str_A = "Saya Programmer Java";
        String str_B = "Saya Suka Pemrograman";
        System.out.println("String A = "+str_A);
        System.out.println("String B = "+str_B);

        int search_A = str_A.indexOf("r");
        System.out.println("Karakter 'r' pada String_A berada di index = "+search_A);
        int search_B = str_B.indexOf("Suka");
        System.out.println("Karakter 'Suka' pada String_B berada di index = "+search_B);
    }
}
