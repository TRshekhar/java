import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readfiles{
    public static void main(String[] args) {
        try {
            // Scanner sc = new Scanner(System.in);
            // System.out.print("Enter the file path: ");
            // String path = sc.nextLine();
            FileInputStream fis = new FileInputStream("log.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

//fileInputStream is used to read the file. It reads the file byte by byte.
//The read() method returns -1 when the end of the file is reached.
//The read() method returns the byte value of the character read.
//We have to typecast it to char to print the character.
//The fis.close() method is used to close the file input stream. It is a good practice to close the file input stream after reading the file. to avoid memory leaks.