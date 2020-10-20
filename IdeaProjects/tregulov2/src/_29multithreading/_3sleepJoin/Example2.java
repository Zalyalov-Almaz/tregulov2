package _29multithreading._3sleepJoin;

public class Example2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000); //метод sleep бросает InterruptedException, если пытаются прервать или приостановаить поток
            }                             //находящийся в спячке
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {            //в выводе мы первой строкой увидим Конец, так как в run обоих потоков есть команда спать по секунде каждую итерацию,
        Thread thread1 = new Thread(new MyRunnable1()); //а поток main таких инструкций не имеет, запускает оба потока (thread1, thread2) и продолжает свою работу без спячки
        Example2 thread2 = new Example2();
        thread1.start();
        thread2.start();

        System.out.println("Конец");
    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() { //так как идет перезапись метода из готового Runnable, мы не можем в сигнатуре метода объявить, что метод может бросать что-то
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}