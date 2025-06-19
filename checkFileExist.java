// Create a program to check if a specific file exists on the disk.
// The program should take the file name as input from the user and check if the file exists or not.
import java.io.File;
import java.util.Scanner;
public class checkFileExist{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of file with extension: ");
            String filename = sc.next();
            File file = new File(filename);
            if(file.canExecute()){
                System.out.println("File exists");
            }else{
                System.out.println("File does not exists");
            }
        } catch (Exception e) {
            System.out.println("An error occures!");
        }
    }
}