package _27lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void changeCar(Car car, Consumer <Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota LC200", "Black", 4.4));
        cars.add(new Car("Toyota LC200", "Black", 4.4));
        cars.add(new Car("Toyota LC200", "Black", 4.4));
        changeCar(cars.get(1), car -> {car.engine = 6.0;});                 //поменяли мотор на машине являющейся элементом cars на индексе 1

        for (Car c : cars) {
            System.out.println(c);
        }
    }
}
// Consumer интерфейс меняющий свойства объекта