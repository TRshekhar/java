import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class writefile {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("FileOutputStream.txt");){            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the text: ");
            fos.write(sc.nextLine().getBytes());
            fos.close();
            System.out.println("File written successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// FileOutputStream is used to write the file. It writes the file byte by byte.
// The write() method writes the byte value of the character.
// We have to convert the string to byte array using getBytes() method.
// we use the fileinputStram and fileoutputstream while working with binary files such as images, audo, videos, etc.
// The fos.close() method is used to close the file output stream. It is a good practice to close the file output stream after writing the file to avoid memory leaks.
// The try-with-resources statement is used to automatically close the resources. It automatically closes the resources after the try block ends. It is available since Java 7. It is a good practice to use try-with-resources statement to close the resources. It avoids memory leaks.