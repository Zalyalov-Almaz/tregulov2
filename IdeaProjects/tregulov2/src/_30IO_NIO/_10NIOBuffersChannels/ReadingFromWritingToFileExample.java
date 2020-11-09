package _30IO_NIO._10NIOBuffersChannels;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;

public class ReadingFromFileExample {

    public static void main(String[] args) {

        try (RandomAccessFile file = new RandomAccessFile("text.txt", "rw");
             FileChannel channel = file.getChannel();) {

            ByteBuffer buffer = ByteBuffer.allocate(25);

            StringBuilder poem = new StringBuilder();

            int byteRead = channel.read(buffer); //byteRead возвращает int количество прочитанных в буфер байт

            while(byteRead > 0) {
                buffer.flip(); // flip перемещает пойнтер буфера в нулевую позицию и меняет режим буфера из режима записи в режим чтения
                while (buffer.hasRemaining()) { //hasRemaining возвращает true, если буферу еще есть что читать
                    poem.append((char) buffer.get()); //добавляем посимвольно байты из буфера в poem
                }
                buffer.clear(); // clear перемещает пойнтер буфера в нулевую позицию и меняет режим буфера из режима чтения в режим записи
                                //clear не затирает содержимое буфера сразу, а при записи в него последовательнро затираеткаждый следующую позицию
                                //заменяя ее.
                byteRead = channel.read(buffer); //переписываем содержимое буфера на следующие 25 байт из channel, повторно заходим во внутренний while,
                                                 //добавляем в конец poem эти след 25 байт
            }
            System.out.println(poem); //выводим конечный poem со стихом на экран

            //___________________________________________________/* Writing to File example *///__________________________________________________

            String einsteinC = "\nThere are only two ways to live your life." +
                               " One is as though nothing is a miracle." +
                               " The other is a though everything is a miracle.";
//            ByteBuffer buffer2 = ByteBuffer.allocate(einsteinC.length()); //назначили capacity для буфера длиной в длину цитаты
//            buffer2.put(einsteinC.getBytes()); //положили в буфер цитату Эйнштейна побайтно
//            buffer2.flip(); //переместили пойнтер буфера в начало и переключили его в режим чтения
//            channel.write(buffer2);
            ByteBuffer buffer2 = ByteBuffer.wrap(einsteinC.getBytes()); //wrap делает все что закомментировано выше
            channel.write(buffer2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
// Когда мы что-то читаем из файла с помощью Buffer и Channel, Channel получает из файла информацию, записывает ее в Buffer
//и программа читает эту информацию из Buffer. При записи в файл все происходит в обратном порядке.
// Buffer - блок памяти, в который мы можем записывать информацию из программы и читать информацию из него. В отличие от потоков, мы
//можем произвольно работать с этим блоком памяти.
// Channel - инструмент который может читать информацию из файла и записывать информацию в него. При записи в файл, Channel
//берет информацию из Buffer и записывает ее в файл, при чтении наоборот.
