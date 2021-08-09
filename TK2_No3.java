import java.io.File;

public class TK2_No3 {
    public static void main(String[] ars) {
        String namadir = "C:/Program Files";
        File f1 = new File(namadir);

        if (f1.isDirectory()){
            System.out.println("Directori dari " + namadir);
            String s[] = f1.list();

            for (int i=0; i<s.length; i++){
                File f = new File (namadir+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i]+" adalah sebuah direktori");
                }
                else {
                    System.out.println(s[i]+" adalah sebuah file");
                }
            }
        } else {
            System.out.println(namadir+" bukan sebuah direktory");
        }
    }
}
