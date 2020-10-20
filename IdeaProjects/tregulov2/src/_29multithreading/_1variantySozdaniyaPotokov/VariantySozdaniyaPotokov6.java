package _29multithreading._1variantySozdaniyaPotokov;

public class VariantySozdaniyaPotokov6 {

    public static void main(String[] args) {
        new Thread(() -> {for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }}).start();
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
// Так как Runnable является функциональным интерфейсом, в параметр конструктора Thread можно передать лямбда выражение