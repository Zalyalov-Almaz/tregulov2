package _29multithreading._1variantySozdaniyaPotokov;

public class VariantySozdaniyaPotokov {

    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        MyThread1 myThread3 = new MyThread1(); //можно дублировать 2 потока, тогда они одновременно будут выполнять одно и то же

        myThread1.start(); // При вызове метода start программа не ждет пока выполниться весь код описанный в MyThread1
        myThread2.start(); //он в это же время начинает выполнять воторой start, который вызывает myThread2, в результате
                            //оба цикла выполняются одновременно
    }
}

class MyThread1 extends Thread {
    @Override                           //если не перезаписывать run, то start ничего не делает
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}