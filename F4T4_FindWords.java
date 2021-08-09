public class F4T4_FindWords {
    public static void main(String[] args) {
        String kalimat ="the show must go on dont look at back again";
        int panjang = kalimat.length();
        int sum = 0;
        for (int i=0; i<panjang;i++){
            if(kalimat.charAt(i)=='u'){
                sum++;
            }
        }
        System.out.println("Jumlah huruf u sebanyak "+sum);
    }
}
