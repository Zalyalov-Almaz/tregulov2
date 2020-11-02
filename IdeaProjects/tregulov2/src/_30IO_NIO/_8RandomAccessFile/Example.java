package _30IO_NIO._8RandomAccessFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Example {

    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("text.txt", "rw")) {
            int a = file.read(); //read прочитает один байт, который находиться на позиции пойнтера(справа от него, для удобства можно называть его курсор)
                                 //и переместит пойнтер на 1 позицию вперед
            String s = file.readLine(); // вывод будет " Crazed Girl" ("A" уже прочлась строкой выше, пойнтер перпеместился на след позицию)
            System.out.println(s);

            file.seek(101);//seek перемещает пойнтер на позицию переданную в параметры
            String s2 = file.readLine();
            long filePointer = file.getFilePointer();//getFilePointer() - возвращает long (позицию пойтера)
            System.out.println(filePointer);

//            file.seek(0);//переместили пойнтер в начало файла
//            file.writeBytes("Hello");//writeBytes заменяет символы в файле начиная с позиции пойнтера

            file.seek(file.length()); //переместили пойнтер в конец файла
            file.writeBytes("\n\n\t\t\t\t\t\t\t\tWilliam Butler"); //Добавили автора в конец и справа

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Класс RandomAccessFile позволяет читать информацию из любого места файла и записывать информацию в любое место файла.
//Конструктор принимает 2 параметра: путь к файлу и режим работы с файлом ("rw" - чтение и запись, "r" - чтение, "w " - запись).
