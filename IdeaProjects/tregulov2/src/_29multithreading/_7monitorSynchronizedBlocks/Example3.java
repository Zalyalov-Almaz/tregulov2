package _29multithreading._7monitorSynchronizedBlocks;

public class Example3 {

//    static final Call call = new Call(); //лучше не использовать всякие выдуманные классы, а написать нижеописанный замок
    static final Object lock = new Object();

    public void mobileCall() {
        synchronized (lock) { //синхронизация 3х методов на статическом поле класса(объекте call)
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call ends");
        }
    }
    public void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("skype call ends");
        }
    }
    public void whatsAppCall() {
        synchronized (lock) {
            System.out.println("whatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("whatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class RunnableImplMobile implements Runnable {
    @Override
    public void run() {
        new Example3().mobileCall();
    }
}
class RunnableImplSkype implements Runnable {
    @Override
    public void run() {
        new Example3().skypeCall();
    }
}
class RunnableImplWhatsApp implements Runnable {
    @Override
    public void run() {
        new Example3().whatsAppCall();
    }
}
class Call {}
//Синхронизировав 3 метода на одном объекте, мы добились синхронности выполнения потоков вызывающих 3 метода одного класса
//Объект должен быть одним и тем же