public class Thread2_MencariKata {
    public static void main(String[] args) {
        String str = "Pada OOP, Fungsi dan variabel dibungkus dalam sebuah objek atau class yang dapat saling berinteraksi, sehingga membentuk sebuah program.";
        int intIndex = str.indexOf("interaksi");
        if (intIndex == -1){
            System.out.println("interaksi not found");
        } else {
            System.out.println("Found interaksi at index "+intIndex);
        }
    }
}
