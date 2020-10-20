package _29multithreading._7monitorSynchronizedBlocks;

public class Example {

    public static void main(String[] args) {
        MyRunnableImpl runnable = new MyRunnableImpl();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter {
    static int count = 0;
}
class MyRunnableImpl implements Runnable {

    private void doWork2() {
        System.out.println("Ура");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) { //синхронизированный кусок тела метода - синхронизированный блок
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}
// Монитор - мехнизм, имеющий 2 состояния(занят\свободен), с помощью которого достигается синхронизация элементов
//и объектов класса
// Синхронизированные блоки - куски тела методов, которые синхронизируются, в то время как остальной код метода оста-
//ется открытым для всех потоков. Используются, когда есть необходимость синхронизировать только какой-то участок тела
//метода, а остальной код в методе синхронизировать не обязательно