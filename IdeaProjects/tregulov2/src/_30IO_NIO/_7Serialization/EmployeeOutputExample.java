package _30IO_NIO._7Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeOutputExample {

    public static void main(String[] args) {
        Car car = new Car("Mercedes E-Class", "Black");
        Employee emp1 = new Employee("Алмаз", "Developement", 31, 5000, car);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"))) {
            objectOutputStream.writeObject(emp1);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
