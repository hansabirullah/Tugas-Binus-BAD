import java.io.File;

public class F5T3_CreateFileReadOnly {
    public static void main(String[] args) {
        File myfile = new File("F:/filejava.txt");
        boolean flag = myfile.setReadOnly();
        if (flag==true) {
            System.out.println("File successfully corverted to Read Only mode!");
        } else {
            System.out.println("Unsuccessful Operation!");
        }
    }
}
