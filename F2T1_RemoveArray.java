import java.util.ArrayList;

public class F2T1_RemoveArray {
    public static void main(String[] args) {
       ArrayList array1 = new ArrayList();
       ArrayList array2 = new ArrayList();
       array1.add(0,"satu");
       array1.add(1, "satu");
       array1.add(2, "tiga");
       array1.add(3, "empat");
       array1.add(4, "lima");
       array1.add(5, "enam");
       array1.add(6, "tujuh");
       array1.add(7, "delapan");
       array1.add(8, "sembilan");
       array1.add(9, "sepuluh");
       array1.add(10, "sebelas");
       array1.add(11, "duabelas");
       array1.add(12, "tigabelas");
       array1.add(13, "empatbelas");
       array1.add(14, "limabelas");
       array1.add(15, "enambelas");
       array1.add(16, "tujuhbelas");
       array1.add(17, "delapanbelas");
       array1.add(18, "sembilanbelas");
       array1.add(19, "duapuluh");
       array2.add(0, "tujuh");
       array2.add(1, "dua");
       array2.add(2, "sembilan");
       array2.add(3, "tigabelas");
       array2.add(4, "sembilanbelas");
       System.out.println("Array1 elements : "+array1);
       System.out.println("Array2 elements : "+array2);
        //remove element array
        array1.remove(16);
        System.out.println("Array1 after remove: "+array1);
        System.out.println("Array2 still same: "+array2);
    }
}
