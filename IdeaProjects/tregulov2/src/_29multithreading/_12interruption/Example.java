package _29multithreading._12interruption;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}
class InterruptedThread extends Thread {

    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 0; i < 1000000000; i++) {
            if (isInterrupted()) {
                System.out.println("main is going to interrupt thread " + this.getName());
                return;
            }
                sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}
// Раньше поток прерывали методом stop(), но это было аналогично тому, чтобы выключить компьютер выдернув вилку из розетки
//Теперь поток не прерывают, а "ставят его к прерыванию" методом interrupt. В свою очередь в потоке можно проверять, поставлен
//ли поток к прерыванию, методом isInterrupted

// Иними словами у нас есть возможность поставить поток на прерывание, а так же проверить поток на поставку к прерыванию, но
//что делать с потоком, если он поставлен на прерывание решать нам.