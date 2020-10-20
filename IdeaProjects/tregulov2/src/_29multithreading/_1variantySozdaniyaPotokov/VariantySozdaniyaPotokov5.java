package _29multithreading._1variantySozdaniyaPotokov;

public class VariantySozdaniyaPotokov5 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        }).start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
// Создание параллельных потоков с помощью ананонимного класса