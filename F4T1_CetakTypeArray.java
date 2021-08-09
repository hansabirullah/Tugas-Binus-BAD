import java.util.Arrays;

public class F4T1_CetakTypeArray {
    public static void printArray(Integer[] inputArray){
        for (Integer element: inputArray){
            System.out.print(element+" ");
        }
    }
    public static void printArray(Double[] inputArray){
        for (Double element: inputArray){
            System.out.print(element);
        }
    }
    public static void printArray(String[] inputArray){
        for (String element: inputArray){
            System.out.println(element);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = new Integer[1];
        Double [] doubleArray = new Double[1];
        String[] StringArray = {"universitas bina nusantara"};
        System.out.println("Array integer: ");
        for (int i= integerArray.length;i<=100; i++){
            Arrays.fill(integerArray,i);
            printArray(integerArray);
        }
        System.out.println("\n\nArray double: ");
        for (double i = 1.0; i<=1.100;i+=0.01){
            Arrays.fill(doubleArray,i);
            printArray(doubleArray);
        }
        System.out.println("\n\nString Array: ");
        printArray(StringArray);
    }
}
