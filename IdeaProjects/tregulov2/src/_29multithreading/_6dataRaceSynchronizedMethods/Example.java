package _29multithreading._6dataRaceSynchronizedMethods;

public class Example {

    public static void main(String[] args) {
        MyRunnableImpl1 runnable = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start(); //срауз несколько потоков имеют доступ к изменению count, в результате мы получаем
        thread2.start(); //непредсказумый вывод из-за возникшего Datarace
        thread3.start();
    }
}
class Counter {
    static int count = 0;
}
class MyRunnableImpl1 implements Runnable {

    public static synchronized void increment() { //помечаем метод словом synchronized, для исключения Data race
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
             increment();
        }
    }
}
// Data race (гонка данных), ситуация когда одновременно несколько потоков меняют и обращаются к переменной.
//При возниконовении Data race результат выполнения программы становится непредсказуемым.