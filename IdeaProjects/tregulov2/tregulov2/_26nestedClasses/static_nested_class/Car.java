package _26nestedClasses.static_nested_class;

public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    void method () {
        System.out.println(Engine.engineCount);
        Engine e = new Engine(200);
        System.out.println(e.horsePower);
    }

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
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


    public static class Engine { //можно сделать его final, abstract, так же этот класс может наследоваться от другого внешнего или внутреннего
        int horsePower;            //может содержать как статические, так и не статические элементы
        static int engineCount;

        public Engine(int horsePower) {
            System.out.println(a); //статический nested класс может напрямую обращаться к статическим элементам outer класса (даже к private),
//            System.out.println(doorCount); но не может напрямую обращаться к не статическим элементам
            this.horsePower = horsePower;
            engineCount++;
        }

        @Override
        public String toString() {
            return "My engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(250); //так как класс Engine статический, мы можем обойтись без создания объекта outer класса, но создавая объект класса Engine
                                                            //мы должны указывать полное имя класса (Car.Engine)
        Car car = new Car("Red", 2, engine);
        System.out.println(car);
//        Car.Engine engine2 = new car.Engine(150); //такое написание не допустимо

    }
}
class Z extends Car.Engine {
    public Z(int horsePower) {
        super(horsePower);
    }
}
//