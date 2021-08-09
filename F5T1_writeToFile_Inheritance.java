import java.io.*;

public class F5T1_writeToFile_Inheritance {
    public static void main(String[] args) {
        String sourceDoc = "F:\\2. BELAJAR\\1. BINUS ONLINE LEARNING\\Semester 4-1\\BUSINESS APPLICATION DEVELOPMENT\\1. FORUM\\bad-week5-writetofile.txt";
        WriteString write = new WriteString(sourceDoc, "teks 1", "teks 2");
        write.writeToDocument();
    }
}
class  Document {
    protected  String target;
    private String text1;
    private  String text2;

    public Document (String target, String text1, String text2){
        this.target = target;
        this.text1 = text1;
        this.text2 = text2;
    }

    public  void writeString (){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter(target));
            out.write(text1+"\n");
            out.close();;

            out = new BufferedWriter(new FileWriter(target, true));
            out.write(text2);
            out.close();

            BufferedReader in = new BufferedReader(new FileReader(target));

            String str;
            while ((str = in.readLine()) !=null){
                System.out.println(str);
            } in.close();
        } catch (IOException e){
            System.out.println("exception occured"+e);
        }
    }
}

class  WriteString extends Document{
    WriteString (String target, String text1, String text2 ){
        super(target, text1, text2);
    }
    public void writeToDocument(){
        writeString();
        System.out.println("Text telah tertulis di "+target);
    }
}
