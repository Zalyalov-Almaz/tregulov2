package _29multithreading._14CallableFuture;

import java.util.concurrent.*;

public class CallableFactorial2 {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(new Factorial2(5));
        try {
            System.out.println("Want to get result");
            factorialResult = future.get();
            System.out.println("Got result");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            service.shutdown();
        }
        System.out.println(factorialResult);
    }
}
class Factorial3 implements Callable<Integer> {

    int f;

    public Factorial3(int f) {
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
                Thread.sleep(1000);
            }
        return result;
    }
}
