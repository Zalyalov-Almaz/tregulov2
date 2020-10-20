package _29multithreading._8WaitNotify;

public class Example {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}
class Market {
    private int breadCount = 0;

    public synchronized void getBread() {
        while(breadCount < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount--;
        System.out.println("Consumer bought 1 loaf of bread");
        System.out.println("Amount of bread in the market " + breadCount);
        notify();
    }
    public synchronized void putBread() {
        while (breadCount >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        breadCount++;
        System.out.println("Produser added 1 loaf of bread");
        System.out.println("Amount of bread in the market " + breadCount);
        notify();
    }
}
class Producer implements Runnable {
    Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
             market.putBread();
        }
    }
}
class Consumer implements Runnable {
    Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}
// wait() Поток, вызывающий wait при определнных условиях, освобождает монитор и переводит этот поток в состояние
//ожидания, до тех пор, пока другой поток не вызовет метод notify
// notify() Поток, вызвавший notify при определнных условиях, уведомляет поток, вызвавший wait, о том, что тот может
//продолжить свою работу. notifyAll "будит" все потоки, вызвавшие wait