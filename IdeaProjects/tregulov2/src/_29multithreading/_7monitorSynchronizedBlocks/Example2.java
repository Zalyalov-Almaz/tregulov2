package _29multithreading._7monitorSynchronizedBlocks;

public class Example2 {
    static int counter = 0;
    public static void increment() {
        synchronized (Example2.class) { //при синхронизации участка кода в статическом методе, мы не можем использовать this,
            counter++;                  //так как при этом используется монитор класса, поэтому в скобках мы пишем класс
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
class R implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Example2.increment();
        }
    }
}
