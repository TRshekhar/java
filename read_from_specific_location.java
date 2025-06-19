import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class read_from_specific_location{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);){
            System.out.print("Enter the file name with extension: ");
            String filename = sc.nextLine();
            try(RandomAccessFile raf = new RandomAccessFile(filename, "r");){      
                // displaying file length 
                System.out.println("File length ("+ filename +") is: "+raf.length());
                System.out.print("Enter the position to read from: ");
                long position = sc.nextLong();
                raf.seek(position);
                while(raf.getFilePointer() < raf.length()){
                    System.out.print( (char)raf.read());
                }
                raf.close();
            } catch (FileNotFoundException e) {
                System.out.println("File Not Found");
                e.printStackTrace();
            } 
            catch (IOException e) {
                System.out.println("IO Exception");
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}