package _29multithreading._4concurencyParallelismSynchronousAsynchronous;

import _29multithreading._3sleepJoin.Example3;

public class Example extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException { //join так же может бросать InterruptedException
        Thread thread1 = new Thread(new MyRunnable2());
        Example thread2 = new Example();
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Конец");
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
// Concurency - постановка к выполнению сразу нескольких задач незаисимо друг от друга.
//В зависимости от архитектуры процессора, concurency может достигаться разными способами.
// Parallelism - выполнение 2-х и более задач одновременно (параллельно). Concurency может
//достигаться с помощью parallelism процессорами с многоядерной архитектурой.
// Synchronous programming - синхронное программирование. Последовательное выполнение инструкций
//программы. В программировании "синхронно" означает последовательно друг за другом.
// Asynchronous programming - асинхронное программирование. Программирование с помощью concurency.
//При асинхронном программировании, программист не может предсказать, какой именно из независимых
//потоков будет выполняться в конкретный момент времени.