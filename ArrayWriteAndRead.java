// write an array of integers to a file read it back
import java.io.*;
import java.util.Scanner;

public class ArrayWriteAndRead{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            System.out.print("Enter the Size of Array: ");
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.print("Enter "+size+" integers: ");
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));){
                for (int i=0; i<size; i++) {
                    bw.write(String.valueOf(arr[i])+", ");
                }
            }

            try(BufferedReader br = new BufferedReader(new FileReader("array.txt"));){
                System.out.println("Content of File: ");
                String line;
                while((line = br.readLine())!=null){
                    System.out.println(line);
                }
            }
            
        }catch(IOException e){
            System.err.println("An error occured: "+e.getMessage());
        }
    }
}