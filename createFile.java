// Write a program to create a new text file and write a message into it
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class createFile{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of file: ");
        String name = sc.nextLine();
        String filename = name+".txt";

        try {
            File obj = new File(filename);
            if(obj.createNewFile()){
                System.out.println("File created: "+ obj.getName());
            }
            else{
                System.out.println("File already exists.");
            }
            
            FileWriter fwrite = new FileWriter(filename);
            System.out.print("Write something in file: ");
            fwrite.write(sc.nextLine());
            fwrite.close();
            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("An error occured");
        }
    }
}