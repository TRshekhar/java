import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class longest_text_file{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter the file name with extension: ");
            String filename = sc.nextLine();

            try(RandomAccessFile raf = new RandomAccessFile(filename,"r");){
                raf.seek(0);
                String longestString = "";
                String letter = "";
                int lenth_of_longestString = 0;
                int pointer = -1;
                while(raf.getFilePointer() < raf.length()){
                    while( pointer != 32 ){
                        pointer = raf.read();
                        longestString += (char)pointer;
                        System.out.print(longestString);
                    }
                                        
                    if(longestString.length() > lenth_of_longestString){
                        lenth_of_longestString = longestString.length();
                        letter = longestString;
                    }
                    
                    System.err.println("");
                    if(raf.getFilePointer() < raf.length()){
                        pointer = -1;
                    }
                }
                raf.close();
                System.out.println("Longest String-->"+letter);
            }catch(IOException e){
                e.printStackTrace();
            }

        }catch(Exception e){
            System.err.println("Error in Scanner: "+e);
        }
    }
}