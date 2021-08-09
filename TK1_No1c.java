public class TK1_No1c {
    public static void main(String[] args) {
        String str_A = "Saya Programmer Java";
        String str_B = "Saya Suka Pemrograman";
        System.out.println("str_A = "+str_A);
        System.out.println("str_B = "+str_B);

        //Mengambil isi substring
        String sub_str_A = str_A.substring(0,4); //substring(index_awal, index_akhir)
        String sub_str_B = str_B.substring(5,21);
        System.out.println("\nMengambil isi sebagian String");
        System.out.println("str_A = "+sub_str_A);
        System.out.println("str_B = "+sub_str_B);
    }
}
