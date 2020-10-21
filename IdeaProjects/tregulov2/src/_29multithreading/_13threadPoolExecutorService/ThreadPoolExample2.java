package _29multithreading._13threadPoolExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample2 {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
//        scheduledExecutorService.schedule(new RunnableImp200(), 3, TimeUnit.SECONDS); //shedule передает задачу описанную в RunnableImp200 в scheduledExecutorService
//                                                                                            //в данном случае оно начнет выполняться через 3секунды послезапуска
        scheduledExecutorService.scheduleAtFixedRate(new RunnableImp200(), 3, 1, TimeUnit.SECONDS); //задача начнет выполняться через 3 секунды, после будет выполняться
                                                                                                                    //каждые 1сек
        Thread.sleep(20000); //даем команду main`у спать 20сек, соответственно scheduledExecutorService будет выполнять свою задачу 20сек
        scheduledExecutorService.shutdown();//shutdown так же завершает работу pool`а после того, как все задачи преданные в него выполнены
    }

}
class RunnableImp200 implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins");
        try {
            Thread.sleep(3000);     //если задача спит дольше чем указанный период в scheduleAtFixedRate, период не будет учитываться и периодичность задачи будет моментальная
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ends");
    }
}
//ScheduledExecutorService создает pool который позволяет задать расписание на запуск потоков из пула