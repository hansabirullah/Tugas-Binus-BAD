import java.util.Enumeration;
import java.util.Hashtable;

public class F8T3_DeretBilHastable {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int a=1; a<550; a++){
            ht.put(a,a);
        }
        Enumeration e = ht.keys();
        while ( (e.hasMoreElements())){
            System.out.println(e.nextElement()+"");
        }
    }
}
