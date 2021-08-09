public class F6T2_ExceptionDeteksiError {
    public static void main(String[] args) {
        
        try {
            throw new Exception("Deteksi Error");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
