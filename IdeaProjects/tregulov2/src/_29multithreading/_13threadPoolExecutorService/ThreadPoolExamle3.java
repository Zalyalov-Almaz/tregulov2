package _29multithreading._13threadPoolExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExamle3 {

    public static void main(String[] args) {
        ExecutorService scheduledExecutorService = Executors.newCachedThreadPool();
        //newCachedThreadPool создает pool который создает в себе потоки по мере надобности
        //при этом, если будут поступать нвые задачи, перед созданием нового потока pool будет проверять,
        //нет ли свободных потоков. Если задачи в пул перестают поступать, через минуту после этого свободные потоки
        //будут удалены

    }
}
class RunnableImp300 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}