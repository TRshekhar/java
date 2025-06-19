import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class appendData{
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("test.txt", true)) {
            fw.write(new Scanner(System.in).nextLine());
            fw.write("\n");
            fw.close();
            System.out.println("Data appended successfully");
        }
         catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// to append the data to the file, we need to pass the second argument as true in the FileWriter constructor. after the file name.
// the above code will append the data to the file test.txt