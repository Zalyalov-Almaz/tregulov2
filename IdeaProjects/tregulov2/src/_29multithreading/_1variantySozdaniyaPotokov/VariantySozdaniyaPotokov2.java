package _29multithreading._1variantySozdaniyaPotokov;

public class VariantySozdaniyaPotokov2 {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new MyThread3()); //Если в первом случае мы создавали объекты классов наследников Thread
        Thread thread2 = new Thread(new MyThread4()); //то здесь мы создаем объекты самого Thread и в параметр конструктора передаем
                                                      //объект класса, имплементирующего Runnable
        thread1.start();
        thread2.start();
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

}
class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }
    }
}
// Интерфейс Runnable используется в случае, если класс, код которого мы хотим запустить потоком, уже является чьим-то наследником
//