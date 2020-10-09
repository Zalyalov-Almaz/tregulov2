package _27lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan", "Red", 2.0)); // метод get интерфейса Supplier не принимает параметров
                                                                                                          // поэтому слева от -> ставим ()
        for (Car car : ourCars) {
            System.out.println(car);
        }
    }
}
class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
// Supplier (Поставщик) - поставляет объекты