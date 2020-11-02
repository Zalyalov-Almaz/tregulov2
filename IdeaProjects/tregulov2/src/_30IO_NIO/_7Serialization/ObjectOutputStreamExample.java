package _30IO_NIO._7Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamExample {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Заур");
        employees.add("Алмаз");
        employees.add("Иван");

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("employees.bin"))) {
            objectOutputStream.writeObject(employees);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Сериализация - преобразование объекта в последовательность байт, для этого существует класс ObjectOutputStream
//Десериализация - восстановление объекта из байт, для этого существует класс ObjectInputStream
