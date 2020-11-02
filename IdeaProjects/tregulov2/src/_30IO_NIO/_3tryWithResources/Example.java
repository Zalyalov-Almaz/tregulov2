package _30IO_NIO._3tryWithResources;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {
        String rubai = "Много лет размышлял я над жизнью земной.\nНепонятного нет для меня под луной.\nМне известно, что мне ничего не известно!\nВот последняя правда, открытая мной.\n";
        String s = "Привет";
        try (FileWriter writer = new FileWriter("C:\\Users\\zalya\\Desktop\\test1.txt")) {
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//                if (rubai.charAt(i) == '.' || rubai.charAt(i) == '!') {
//                    writer.write("\n");
//                }
//            }
            writer.write(rubai);
            System.out.println("Writing done");
        }

        try (FileReader reader = new FileReader("C:\\Users\\zalya\\Desktop\\test1.txt")) {
            int character;
            while ((character = reader.read()) != -1) { //read возвращает -1, если в читаемом файле, кончились символы
                System.out.print((char)character);      //преобразуем индекс символа в char, чтоб получить соответствующий символ
            }
            System.out.println("Reading done");
        }
    }
}
// Если после try открыть круглые скобки и создать потоки чтения/записи там, то эти ресурсы будут автоматически закрыты
//после выполнения блока try. То есть в этом случае на будет необязатльно писать finally блок с методом close внутри. На самом
//деле при таком написании java сама пишет finally, так что, если бросить искл в сигнатуре метода, то
//catch мы можем вообще не писать.