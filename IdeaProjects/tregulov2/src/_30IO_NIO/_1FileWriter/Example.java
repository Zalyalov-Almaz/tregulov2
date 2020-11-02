package _30IO_NIO._1FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\nНепонятного нет для меня под луной.\nМне известно, что мне ничего не известно!\nВот последняя правда, открытая мной.\n";
        String s = "Привет";
        FileWriter writer = null;
        try {
            writer = new FileWriter("C:\\Users\\zalya\\Desktop\\test1.txt", true);
//            for (int i = 0; i < rubai.length(); i++) { //посимовльная запись строки в файл
//                writer.write(rubai.charAt(i));
//                if (rubai.charAt(i) == '.' || rubai.charAt(i) == '!') {
//                    writer.write("\n");
//                }
//            }
            writer.write(rubai); //передаем в поток посностью всю строку
            System.out.println("Done");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }
    }
}
// FileWriter - поток для записи в файл. Второй параметр, при значении true записывает данные из потока в конец файла, не затирая содержимое
// FileReader и FileWriter - используются для работы с текстовыми файлами