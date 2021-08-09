import java.util.Arrays;
import java.util.Scanner;

public class TK1_No2 {
    public static void main(String[] args) {
        Scanner jumlah = new Scanner(System.in);
        System.out.println("Masukan N =  ");
        int length = jumlah.nextInt();
        int [] myArray = new int[length];
        System.out.println("Input nilai masing-masing: ");
        for (int i=0; i<length; i++){
            myArray[i] = jumlah.nextInt();
        }
        Arrays.sort(myArray);
        System.out.print("Bilangan: ");
        System.out.println(Arrays.toString(myArray));
        System.out.println("Nilai Minimum = "+myArray[0]);
        System.out.println("Nilai Maksimum = "+myArray[myArray.length-1]);
        double med;
        if (myArray.length %2 == 0){
            med = ((double)myArray[myArray.length/2]+
                    (double)myArray[myArray.length/2 - 1])-2;
        } else
            med = (double) myArray[myArray.length/2];
        System.out.println("Nilai Median= "+med);
    }
}
