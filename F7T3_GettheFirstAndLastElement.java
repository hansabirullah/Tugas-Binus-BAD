import java.util.LinkedList;

public class F7T3_GettheFirstAndLastElement {
    public static void main(String[] args) {
        LinkedList<Integer> IList = new LinkedList<Integer>();
        for (int x=1; x<=550; x++){
            IList.add(x);
        }
        System.out.println("First element is: "+IList.getFirst());
        System.out.println("Last element is: "+IList.getLast());
    }
}
