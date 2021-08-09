import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class F2T2_MergeTwoArrays {
    public static void main(String[] args) {
        String array1 [] = {"ketika", "belajar", "tentang", "web",
                "development", "mungkin", "anda", "pernah", "mendengar",
                "tentang", "React", "JS"};

        String array2 [] = {"istilah", "ini", "bisa", "jadi",
                "membuat", "anda", "bertanya", "tanya", "apa", "itu", "React", "JS"};

        List list = new ArrayList(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));

    }
}
