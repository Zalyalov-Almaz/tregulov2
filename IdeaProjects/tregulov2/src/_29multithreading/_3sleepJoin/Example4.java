package _29multithreading._3sleepJoin;

public class Example4 {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread = new Thread(new Worker());

        thread.start();
        thread.join(1500);      //здесь мы указываем, что main должен ждать пока не завершится thread или пока не пройдет 1,5сек
        System.out.println("Main ends");//в thread указано, что после начала работы он спит 2,5сек, значит сначла выйдет Main ends и
    }                                   //через сек после этого work ends
}
class Worker implements Runnable {
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