import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class F3T3_TimeDifferentCountryFormat {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("today is "+d1.toString());
        Locale locItalian = new Locale("it", "ch");
        DateFormat df = DateFormat.getDateInstance
                (DateFormat.FULL,Locale.ITALIAN);
        System.out.println("Today is in Italian Languange in Switzerland Format: "+df.format(d1));
    }
}
