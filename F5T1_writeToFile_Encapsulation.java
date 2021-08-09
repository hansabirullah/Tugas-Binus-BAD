import java.io.*;

public class F5T1_writeToFile_Encapsulation {
    public static void main(String[] args) {
        SourceDocument source = new SourceDocument();
        source.setTarget(Constants.sourceDoc);
        TulisString write = new TulisString();
    write.write(source.getTarget()); }
}

class Constants {
    final static String sourceDoc = "F:\\2. BELAJAR\\1. BINUS ONLINE LEARNING\\Semester 4-1\\BUSINESS APPLICATION DEVELOPMENT\\1. FORUM\\bad-week5-writetofile.txt";
}
class SourceDocument {
    private String target;
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
}
class TulisString { public void write(String filename) {
    try { BufferedWriter out = new BufferedWriter(new FileWriter(filename));
        out.write("Teks 1\n"); out.close();
        out = new BufferedWriter(new FileWriter(filename,true));
        out.write("Teks 2");
        out.close(); BufferedReader in = new BufferedReader(new FileReader(filename));
        String str; while ((str = in.readLine()) != null) { System.out.println(str);
        }
        in.close();
}
    catch (IOException e) {
        System.out.println("exception occoured"+ e);
    }
}
}