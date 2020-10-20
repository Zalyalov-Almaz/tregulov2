package _29multithreading._11daemonThreads;

public class Example extends Thread {

    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}
class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
// Daemon threads ("потоки демоны") - предназначены для выполнения фоновых задач и оказания различных сервисов
//user потокам. При завершении работы последнего User потока, программа завершает свою работу, не дожидаясь завершения
//потока демона.
// Чтобы объявить поток демоном, нужно после создания, перед запуском вызвать его метод setDaemon. Проверить, является ли
//этот поток демоном, можно вызвав его метод isDaemon