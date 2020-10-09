package _26nestedClasses.inner_class;

public class InnerClassExample {

    public static void main(String[] args) {
        Car car = new Car("Black", 4);
        Car.Engine engine = car.new Engine(300); //создание двигателя для машины отдельно, после создания машины
        car.setEngine(engine);
    }
}
class Car {
    String color;
    int doorCount;
    private Engine engine;


    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
//        this.engine = this.new Engine(horsePower); //реализация создания объекта не статического inner класса в конструкторе
    }
    public void setEngine (Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }


    public class Engine { //можно сделать его final, abstract, так же этот класс может наследоваться от другого внешнего или внутреннего
        int horsePower;
        //    public static final int A = 5; не статический вложенный класс не может содержать статических элементов, кроме констант

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}