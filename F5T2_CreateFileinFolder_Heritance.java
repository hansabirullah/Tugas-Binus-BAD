import java.io.File;
import java.io.IOException;

public class F5T2_CreateFileinFolder_Heritance {
    public static void main(String[] args) {
        final String dirTarget ="C:/Users/user/Documents/";

        FileManagement files = new FileManagement();
        files.setDirectory(dirTarget);
        files.showDirectory();
        try {
            files.createFile();
        } catch ( IOException e){
            System.out.println(e);
        }
    }
}
class FileConstans{
    final static  String filePrefix = "JavaTemp";
    final static String fileExt = ".txt";
}
class  DirectoryManagement {
    String directoryTarget;

    public void setDirectory(String dir){
        this.directoryTarget = dir;
    }
    public void showDirectory(){
        System.out.println("Directory set to: "+directoryTarget);
    }
}
class  FileManagement extends DirectoryManagement{
    File file = null;

    public void  createFile() throws IOException{
        File dir = new File(directoryTarget);
        file = File.createTempFile(FileConstans.filePrefix,
                FileConstans.fileExt, dir );
        System.out.println("File create successfully in: "+file.getPath());
    }
}
