package _29multithreading._6dataRaceSynchronizedMethods;

public class Example2 {
    static int counter = 0;
    public static synchronized void increment() {
        counter++;
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
// Чтобы избежать Data race при выполнении потоков, метод используемый этими потоками, помечается ключевым словом synchronized
//К таким методам в один момент времени может обращаться только один поток, то есть поток который обратился к свободному
//на данный момент методу, ставит "замок" (lock) на этот метод и остальные потоки ждут пока метод не совободится.