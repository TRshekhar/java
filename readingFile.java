//Develop a program to read the contents of a text file line by line
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

//Reading the file line by line
public class readingFile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter File name: ");
        String name = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(name))) {
            String Line;
            int i=1;
            while ((Line = br.readLine()) != null) {
                System.out.println(i++ +"  "+Line);
            }            
        } catch (Exception e) {
            System.out.println("An error occured: "+e.getMessage());
        }
    }
}