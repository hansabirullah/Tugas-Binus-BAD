public class F2T5_WriteArrayStringToConsole {
    public static void main(String[] args) {
       String [] Paragraf = new String [2];
       Paragraf [0] = " Berapa banyak kalimat dalam satu paragraf? " +
               "Tidak ada ketentuan khusus dalam hal ini. Akan tetapi, " +
               "dalam penulisan karya ilmiah, biasanya disarankan tiga sampai lima kalimat, " +
               "atau minimal tiga baris. Apakah ketentuan tersebut sudah paten?";
       Paragraf [1] = " Dalam KBBI, paragraf adalah bagian bab dalam suatu karangan " +
               "(biasanya mengandung satu ide pokok dan penulisannya dimulai dengan garis baru). " +
               "Hal ini mengisyaratkan bahwa paragraf paling tidak mengandung dua kalimat: " +
               "satu kalimat pokok dan satu kalimat penjelas";
        for (int i = 0; i < Paragraf.length; i++){
            System.out.println(Paragraf[i]);
        }
    }
}
