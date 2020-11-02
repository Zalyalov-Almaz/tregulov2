package _30IO_NIO._4bufferedReaderWriter;

import java.io.*;

public class Example {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                                     new FileReader("C:\\Users\\zalya\\Desktop\\test1.txt"));
             BufferedWriter writer = new BufferedWriter(
                                     new FileWriter("C:\\Users\\zalya\\Desktop\\test2.txt"));) {
//             int character; //в данном примере одновременные, посимвольное чтение из test1 и запись соодержимого в test2
//             while ((character = reader.read()) != -1) {
//                 writer.write(character);
//             }
            String line;
            while ((line = reader.readLine()) != null) { //у BufferedReader есть метод readLine() - читает строку
                writer.write(line);
                writer.write('\n'); //чтобы каждая новая строка из test1 записывалась в новую строку в test2
            }
        }
    }
}
// Буферизация - процесс загрузки части файла, при его потоковой передаче(например музыка или видео). Использование буфери-
//зации в потоках, позволяет достичь большей эффективности при чтении файла или записи в него. Буферизированные потоки -
//это обертки принимающие в параметры обычные потоки. При работе с обычным потоком например FileReader, мы посимвольно
//читаем файл, каждый раз обращаясь к файлу, а при работе с буферизированным потоком, мы записываем посимвольно весь файл
//в поток, а оттуда уже работаем со всем содержимым.