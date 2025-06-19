import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class dataOutInStream {
    public static void main(String[] args) {
        
        // try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"))){
        //     dos.writeInt(100900);
        //     dos.writeDouble(99.999999);
        //     dos.writeBoolean(true);

        //     System.out.println("Data written successfully.");
        // } catch (IOException e) {
        //     System.out.println(e);
        // }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("log.txt"))) {            
            int number = dis.readInt();
            double value = dis.readDouble();
            boolean status = dis.readBoolean();

            System.out.println("Integer: " + number);
            System.out.println("Double: " + value);
            System.out.println("Boolean: " + status);
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
 
//  In the above example, we have used  DataInputStream  and  DataOutputStream  classes to read and write data. 
//  DataInputStream class is used to read data from the file.
//  DataOutputStream class is used to write data to the file.
//  The DataInputStream class contains methods to read the primitive data types like int, double, char, etc.
//  The DataOutputStream class contains methods to write the primitive data types like int, double, char, etc.
//  Java BufferedInputStream and BufferedOutputStream 
//  Java BufferedInputStream and BufferedOutputStream classes are used to read and write data in a buffered way. It makes the performance faster.