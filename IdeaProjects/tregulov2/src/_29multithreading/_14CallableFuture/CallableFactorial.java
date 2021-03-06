package _29multithreading._14CallableFuture;

import java.util.concurrent.*;

public class CallableFactorial {

    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new Factorial2(5)); //метод call имеет возврат, поэтому мы можем записать возвращаемое значение,
        try {                                                          //в переменную типа Future(submit передает задачу в пул)
            factorialResult = future.get(); //get интерфейса Future возвращает значение записанное в его переменную
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause()); //getCause класса ExecutionException возвращает сообщение с причиной исключения
        }
        finally {
            service.shutdown();
        }
        System.out.println(factorialResult);
    }
}
class Factorial2 implements Callable<Integer> {

    int f;

    public Factorial2(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0) {
            throw new Exception("Не верное значение");
        }
            int result = 1;
            for (int i = 1; i <= f; i++) {
                 result *= i;
            }
        return result;
    }
}