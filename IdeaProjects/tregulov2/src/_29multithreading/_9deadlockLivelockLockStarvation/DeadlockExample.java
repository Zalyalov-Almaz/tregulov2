package _29multithreading._9deadlockLivelockLockStarvation;



public class DeadlockExample {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}
class Thread10 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread10: lock1 monitor capture attempt");
        synchronized (DeadlockExample.lock1) {
            System.out.println("Thread10: lock1 monitor captured");
            System.out.println("Thread10: lock2 monitor capture attempt");
            synchronized (DeadlockExample.lock2) {
                System.out.println("Thread10: lock1, lock2 monitors captured");
            }
        }
    }
}
class Thread20 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread20: lock1 monitor capture attempt");
//        synchronized (DeadlockExample.lock2) { //меняем порядок обращения потоков к замкам на одинаковый, чтобы избежать deadlock
        synchronized (DeadlockExample.lock1) {
            System.out.println("Thread20: lock1 monitor captured");
            System.out.println("Thread20: lock2 monitor capture attempt");
            synchronized (DeadlockExample.lock2) {
                System.out.println("Thread20: lock1, lock2 monitors captured");
            }
        }
    }
}
// Deadlock - ситуация, когда 2 или более потока заняли мониторы и бесконечно ждут их освобождения друг другом, ничего не делая.
//Чтобы избежать deadlock, порядок обращения потоков к замкам должен быть одинаковым.
// Livelock - ситуация, когда 2 или более потока залочены навсегда, проделывают какую-то работу, но без результата
// Lock starvation - ситуация когда более медленные или менее приоритетные потоки долгое/всё время ждут