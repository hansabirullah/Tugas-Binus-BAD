import java.util.Arrays;

public class F4T5_TotalBilangan {
    public static void main(String[] args) {
        int [] bilangan = {30, 40, 10, 60, 50, 20, 9, 23, 23, 25, 43, 43, 25, 60};
        int sum = 0;
        for (int i=0; i< bilangan.length; i++){
            sum += bilangan [i];
        }
        System.out.println("jumlah dari"+ Arrays.toString(bilangan)+" adalah "+sum);
    }
}
