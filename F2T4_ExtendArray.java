import java.util.Arrays;
import  java.util.ArrayList;
import  java.util.List;

public class F2T4_ExtendArray {
    public static void main(String[] args) {
        String [] names = new String[]
                {"berapa", "banyak", "kalimat", "dalam", "satu",
                        "paragraf", "tidak", "ada", "ketentuan",
                        "khusus", "dalam", "hal", "ini", "akan",
                        "tetapi", "dalam", "penulisan", "karya",
                        "ilmiah", "biasanya", "disarankan", "tiga",
                        "sampai", "lima", "kalimat", "atau", "minimal",
                        "tiga", "baris", "apakah", "ketentuan", "tersebut",
                        "sudah", "paten","dalam", "KBBI", "paragraf", "adalah",
                        "bagian", "bab", "dalam", "suatu", "karangan" ,
                        "biasanya", "mengandung", "satu", "ide", "pokok",
                        "dan", "penulisannya", "dimulai", "dengan", "garis baru",
                        "hal", "ini","mengisyaratkan", "bahwa", "paragraf", "paling",
                        "tidak", "mengandung", "dua", "kalimat", "satu",
                        "kalimat", "pokok", "dan", "satu", "kalimat", "penjelas"};
        String [] extend = new String [82] ;
        extend [70] = "akan";
        extend [71] = "tetapi";
        extend [72] = "berbeda";
        extend [73] = "dengan";
        extend [74] = "penjelasan";
        extend [75] = "Windy Ariestanty";
        extend [76] = "yang";
        extend [77] = "disampaikan";
        extend [78] = "kepada";
        extend [79] = "Ivan";
        extend [80] = "Lanin";
        extend [81] = "menurutnya";

        System.arraycopy(names, 0, extend, 0, names.length);
        for (String str : extend){
            System.out.println(str);
        }
    }
}
