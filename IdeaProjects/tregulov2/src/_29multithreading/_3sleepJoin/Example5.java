package _29multithreading._3sleepJoin;

public class Example5 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker2());
        System.out.println(thread.getState());  //возвращает состояние потока (вывод NEW, поток создан, но еще не стратовал)
        thread.start();
        System.out.println(thread.getState()); //вывод RUNNABLE, поток стартовал и выполняется
        thread.join();
        System.out.println(thread.getState()); //вывод TERMINATED, поток завершил свою работу
        System.out.println("Main ends");
    }
}
class Worker2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work ends");
    }
}
// getState() возвращает состояние потока на текущей строке. Если поток работает очень быстро, то результат этого метода может оказаться неактуальным