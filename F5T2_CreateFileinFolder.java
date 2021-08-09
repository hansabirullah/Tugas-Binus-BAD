import java.io.File;
import java.io.IOException;

public class F5T2_CreateFileinFolder {
    public static void main(String[] args) {
        try {
            File file = new File ("F:/filejava.txt");

            if(file.createNewFile()){
                System.out.println("File sudah dibuat!");
            } else {
                System.out.println("File sudah ada!");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

