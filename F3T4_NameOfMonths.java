import java.text.DateFormatSymbols;

public class F3T4_NameOfMonths {
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols()
                .getShortMonths();
        for (int i=0; i < (shortMonths.length-1); i++){
            String shortMonth = shortMonths [i];
            System.out.println("ShortMonth= "+shortMonth);
        }
    }
}
