public class Search_kata_dalamString {
    public static void main(String[] args) {
        String storing = "Hello readers";
        int intIndex = storing.indexOf("Hello");
        if (intIndex == - 1){
            System.out.println("Hello not found");
        } else {
            System.out.println("Found Hello at index "+ intIndex);
        }
    }
}

