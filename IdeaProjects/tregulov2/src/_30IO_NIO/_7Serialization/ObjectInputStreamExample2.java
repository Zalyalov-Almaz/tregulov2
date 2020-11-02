package _30IO_NIO._7Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamExample2 {
    public static void main(String[] args) {
        List<String> employees;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees.bin"))) {
            employees = (List) objectInputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
