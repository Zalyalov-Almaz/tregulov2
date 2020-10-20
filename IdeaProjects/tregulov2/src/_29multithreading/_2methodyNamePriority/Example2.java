package _29multithreading._2methodyNamePriority;

public class Example2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Метод run. Поток: " + Thread.currentThread().getName()); //currentThread возвращает информацию о потоке
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Example2());
        thread.start();
        System.out.println("Метод main. Поток: " + Thread.currentThread().getName());
    }
}
