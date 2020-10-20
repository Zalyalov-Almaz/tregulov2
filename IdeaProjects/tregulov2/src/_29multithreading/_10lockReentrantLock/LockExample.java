package _29multithreading._10lockReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    public static void main(String[] args) {

    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call starts");
            Thread.sleep(3000);
            System.out.println("Mobile call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call starts");
            Thread.sleep(5000);
            System.out.println("Skype call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
    void whatsAppCall() {
        lock.lock();
        try {
            System.out.println("WhatsApp call starts");
            Thread.sleep(7000);
            System.out.println("WhatsApp call ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }
}
// Lock - интерфейс, который имплементируется классом ReentrantLock. Lock нужен для достижения синхронизации между потоками
// Метод lock ставит замок на свой объект и тогда к коду который идет ниже в ожно и то же время может обратиться только один поток.
// Поток, завершив свою работу, чтобы открыть доступ вызывает метод unlock, который желательно писать в блоке finally, чтобы
//замок снялся даже если будет выброшено исключение
// Метод tryLock действует так же как и lock, но если монитор замка занят, то поток продолжает выполнять свой последующий код