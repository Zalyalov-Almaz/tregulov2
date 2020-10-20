package _29multithreading._10lockReentrantLock;

import javax.xml.stream.events.StartDocument;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Алмаз", lock);
        new Employee("Олег", lock);
        new Employee("Елена", lock);
        new Employee("Виктор", lock);
        new Employee("Марина", lock);

    }
}
class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + " is waiting");
//            lock.lock();
                System.out.println(name + " is using ATM");
                Thread.sleep(2000);
                System.out.println(name + " is ended using ATM");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else System.out.println(name + " will try use the ATM later");
    }
}
// Метод tryLock действует так же как и lock, но если монитор замка занят, то поток продолжает выполнять свой последующий код