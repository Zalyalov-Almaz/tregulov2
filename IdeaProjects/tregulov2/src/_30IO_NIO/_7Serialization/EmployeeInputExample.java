package _30IO_NIO._7Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeInputExample {
    public static void main(String[] args) {
        Employee employee = null;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employees.bin"))) {
            employee = (Employee) objectInputStream.readObject();
            System.out.println(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(employee.getCar());
    }
}
