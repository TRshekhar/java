import java.io.File;

public class listfilesofDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\downloads\\shekhar code\\Java\\IO");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("Directory: " + f.getName());
            } else {
                System.out.println("File: " + f.getName());
            }
        }
    }
}