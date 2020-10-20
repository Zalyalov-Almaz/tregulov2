package _29multithreading._3sleepJoin;

public class Example {

    public static void main(String[] args) throws InterruptedException { //метод sleep может бросать InterruptedException
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000); //метод sleep останавливает программу на время в миллисекундах, переданное в параметр
        }
        System.out.println("Поехали");
    }
}
