package _30IO_NIO._2fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\zalya\\Desktop\\test1.txt");
            int character;
            while ((character = reader.read()) != -1) { //read возвращает -1, если в читаемом файле, кончились символы
                System.out.print((char)character);      //преобразуем индекс символа в char, чтоб получить соответствующий символ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
// FileReader и FileWriter - используются для работы с текстовыми файлами
// read() возвращает int, индекс прочтенного символа в utf-16, преобразуя его в char мы получаем соответствующий символ