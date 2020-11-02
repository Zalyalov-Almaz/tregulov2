package _30IO_NIO._6DataInputStreamOutputStream;

import java.io.*;

public class Example {

    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("test_dataOutputStream.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("test_dataOutputStream.bin"))) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(50024);
            outputStream.writeLong(10000000000L);
            outputStream.writeFloat(3.14f);
            outputStream.writeDouble(3.14);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// DataInputStream и DataOutputStream - потоки предназначенные для чтения/записи примитивных типов данных из файлов