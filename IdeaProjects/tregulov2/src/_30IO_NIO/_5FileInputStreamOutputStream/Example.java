package _30IO_NIO._5FileInputStreamOutputStream;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\zalya\\Pictures\\Camera Roll\\8B4osFw_m1A.jpg"));
             BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("C:\\Users\\zalya\\Pictures\\Camera Roll\\8B4osFw_m1A2.jpg"));) {
             int character; //в данном примере одновременные, посимвольное чтение из test1 и запись соодержимого в test2
             while ((character = inputStream.read()) != -1) {
                 outputStream.write(character);
             }
        }
    }
}

//Мы не можем использовать потоки, предназначенные для работы с текстовыми файлами(FileReader, FileWriter),
//при работе с бинарными файлами. Для работы с бинарми файлами есть потоки FileInputStream FileOutputStream.
//У них так же есть обертки BufferedInputStream и BufferedOutputStream