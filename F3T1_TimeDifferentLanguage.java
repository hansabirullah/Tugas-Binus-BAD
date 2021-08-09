import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class F3T1_TimeDifferentLanguage {
    public static void main(String[] args) throws  Exception{
        Date d1 = new Date();
        System.out.println("today is"+ d1.toString());
        Locale locItalian = new Locale("it");
        DateFormat df = DateFormat.getDateInstance
                (DateFormat.FULL, locItalian);
        System.out.println("Today is "+ df.format(d1));
    }
}
