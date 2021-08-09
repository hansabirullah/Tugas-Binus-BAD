import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class F8T1_FindWordArrayList {
    public static void main(String[] args) {
        List list = Arrays.asList("Spasi baris adalah ruang antara setiap baris dalam sebuah paragraf. Word memungkinkan Anda untuk menyesuaikan jarak baris menjadi satu spasi atau ketinggian satu baris, spasi ganda atau ketinggian dua baris, atau jumlah lainnya yang Anda inginkan. Jarak baris standar di Word 1.08, yang sedikit lebih besar dari satu spasi." +
                "Pada gambar di bawah ini, Anda dapat membandingkan berbagai jenis spasi. Dari kiri ke kanan, gambar ini menampilkan spasi baris yang standar, spasi tunggal, dan spasi ganda. Pilihan spasi baris Anda tidak terbatas pada salah satu menu di Line and Paragraph Spacing. Untuk mengatur jarak dengan lebih presisi, pilih Line Spacing Options dari menu untuk mengakses kotak dialog Paragraph. Kemudian Anda akan memiliki beberapa pilihan lainnya yang dapat Anda gunakan untuk menyesuaikan jarak. Exactly: Bila Anda memilih opsi ini, jarak baris diukur dalam poin, seperti ukuran font. Misalnya, jika Anda menggunakan ukuran teks 12-point, Anda bisa menggunakan spasi dengan jarak 15-point.At least: Seperti pilihan Exactly, ini memungkinkan Anda memilih berapa banyak poin dari jarak yang Anda inginkan. Namun, jika Anda memiliki ukuran teks yang berbeda pada baris yang sama, jarak spasinya akan diperluas sesuai dengan teks yang lebih besar. " +
                "Multiple: Opsi ini memungkinkan Anda mengetik jumlah baris spasi yang Anda inginkan. Misalnya, memilih Multiple dan mengubah jarak menjadi 1,2 akan membuat teks sedikit lebih menyebar daripada teks satu spasi. Jika Anda ingin baris bersama-sama menjadi lebih dekat, Anda dapat memilih nilai yang lebih kecil, seperti 0,9.".split(" "));
        System.out.println("List: "+list);
        List sublist = Arrays.asList("Spasi".split(" "));
        System.out.println("Sublist: "+sublist);
        System.out.println("index of sublist: "+ Collections.indexOfSubList(list,sublist));
        System.out.println("Last index of sublist: "+ Collections.lastIndexOfSubList(list,sublist));
    }
}
