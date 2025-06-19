import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class randomAccessFile {
    public static void main(String[] args){
        try(RandomAccessFile raf = new RandomAccessFile("array.txt", "rw")){
            raf.writeUTF("Hello World");
            raf.writeInt(1234);
            raf.writeDouble(1.2563456789765432);
            raf.writeBoolean(true);
            raf.writeChar('A');
            raf.writeByte(65);
            raf.writeShort(123);
            raf.writeLong(1234567890);
            raf.writeFloat(1.2342345678f);

            raf.seek(0);
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readUTF());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readInt());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readDouble());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readBoolean());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readChar());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readByte());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readShort());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readLong());
            System.out.println("Pointer: "+raf.getFilePointer());
            System.out.println(raf.readFloat());
            System.out.println("Pointer: "+raf.getFilePointer());

            raf.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

//use RandomAccessFile to write and read data from a file at any position by using pointer.
//writeUTF() method writes a string to the file.
//mainly used to write primitive data types to the file.
//seek() method is used to set the pointer to a specific position.
//It is also used to play with binary files.
//It throws FileNotFoundException and IOException.