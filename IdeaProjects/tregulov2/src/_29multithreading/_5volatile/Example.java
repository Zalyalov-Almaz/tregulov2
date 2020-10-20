package _29multithreading._5volatile;

public class Example extends Thread {

    volatile boolean b = true;
//    boolean b = true;

    @Override
    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("Loop is finished, counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Example thread = new Example();
        thread.start(); //начинает работу поток main, запускает thread,
        Thread.sleep(3000);//спит 3 секунды
        System.out.println("After 3 seconds its time to wake up");//просыпается
        thread.b = false; //меняет значение переменной b, но делает это только в cash процессора исполняющего main.
        thread.join();
        System.out.println("End of programm");
    }
}
// Когда main меняет значение переменной b на false, он делает это только в cash процессора, выполняющего main. Мы
//не можем предсказать, когда это значение будет передано в главную память и когда поток thread заберет это значение
//из главной памяти в cash процессора, исполняющего thread(то есть когда в объекте thread измениться значение этой переменной).
//Таким образом цикл описанный в run класса Exapmple в потоке thread будет продолжаться неизвестное количество времени.
//Чтобы этого избежать, переменную помечают ключевым словом volatile, такие переменные не храняться в cash ядер или процессоров,
//а храняться только в главной памяти, поэтому поток main проснувшись через 3сек и поменяв b на false, прекращает цикл,
//завершает thread.

// Переменная помеченная ключевым словом volatile, хранится только в основной памяти. Оно используется для синхронизации переменной
//между потоками, когда только один поток может изменять эту переменную, а остальные могу ее только читать. В случаях, когда более
//одного потока имеют возможность менять такую переменную, эта техника работает некорректно.
