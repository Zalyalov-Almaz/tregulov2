package _29multithreading._2methodyNamePriority;

public class Example {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        System.out.println("Имя потока thread = " + thread.getName() + " Приоритет потока = " + thread.getPriority());
        thread.setName("Мой поток");
        thread.setPriority(10);
        thread.setPriority(Thread.MAX_PRIORITY);//можно использовать готовые константы приоритетов
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.setPriority(Thread.NORM_PRIORITY);
    }
}
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Привет");
    }
}

// Имя потока по умолчанию это Thread-<number>, где number - это цифра в порядке создания (от 0). Мы можем задать имя методом setName
// Приоритетом потока по умолчанию является 5 (от 1 до 10, где 10 - наивысший приоритет). Мы можем задать приоритет методом setPriority
//более высокий приоритет не является гарантией более быстрого запуска