package _29multithreading._1variantySozdaniyaPotokov;

public class VariantySozdaniyaPotokov3 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        VariantySozdaniyaPotokov3 thread1 = new VariantySozdaniyaPotokov3(); //Здесь мы использовали как поток метод main
        thread1.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
// Запускается поток метода main, от него отпочковывается thread1, но main продолжает свою работу, так как в нем еще есть код.
//Такой вариант тоже возможен, но на мой взгляд тут снижается читаемость