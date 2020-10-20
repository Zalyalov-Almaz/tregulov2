package _29multithreading._3sleepJoin;

public class Example3 extends Thread {
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

    public static void main(String[] args) throws InterruptedException { //join так же может бросать InterruptedException
        Thread thread1 = new Thread(new MyRunnable2());
        Example3 thread2 = new Example3();
        thread1.start();
        thread2.start();

        thread1.join(); //поток в котором был вызван join (main), будет ждать пока завершат свою работу потоки,
        thread2.join(); //вызвавшие этот метод (thread1, thread2), поэтому "Конец" будет выведен в конце аутпута

        System.out.println("Конец");
    }
}

class MyRunnable2 implements Runnable {

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
