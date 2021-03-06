package _29multithreading._13threadPoolExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        ExecutorService executorService = Executors.newSingleThreadExecutor(); //newSingleThreadExecutor создает pool, содержащий всего один thread
        for (int i = 0; i < 10; i++) {
            executorService.execute(new RunnableImp100()); //execute передает задачу, описанную в методе run переданного объекта
        }                                                  //в Thread pool, где оно выполняется одним из потоков

        executorService.shutdown();                        //после вызова метода shutdown, pool понимает, что все задачи выполнены(в данном случае,
                                                           //закончились итерации цикла) и прекращает свою работу.
        executorService.awaitTermination(5, TimeUnit.SECONDS);//awaitTermination принуждает поток в котором он вызвался подождать пока не выполнятся
                                                                     //все задачи executorService либо пока не пройдет время переданное в параметр
        System.out.println("Main ends");
    }
}

class RunnableImp100 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
// Thread pool - это множество потоков, предназначенное для выполнения какого-то множества задач. Thread pool сам решает
//какой из потоков, какую задачу будет выполнять.
// В Java с thread pool`ами удобнее всего работать по средством ExecutorService.
// Thread pool удобнее всего создавать, используя factory методы класса Executors:
//Executors.newFixedThreadPool(n) - создаст Thread pool с n потоками(где n число потоков);
//Executors.newSingleThreadPool() - создаст Thread pool с 1 потоком


