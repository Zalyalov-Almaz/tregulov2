package _29multithreading._1variantySozdaniyaPotokov;

public class VariantySozdaniyaPotokov4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new VariantySozdaniyaPotokov4());
        thread1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
// Здесь почти тоже самое, что и в VariantySozdaniyaPotokov3, но уже не с помощью наследования Thread,
//а имплементацией Runnable