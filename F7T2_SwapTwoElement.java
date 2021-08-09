import java.util.Collections;
import java.util.Vector;

public class F7T2_SwapTwoElement {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        for (int x=1; x<=550; x++){
            v.add(x);
        }
        //Swapping value
        System.out.println(v);
        Collections.swap(v, 0, 549);
        System.out.println("After swapping");
        System.out.println(v);
    }
}
