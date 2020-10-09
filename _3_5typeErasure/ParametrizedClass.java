package _3_5typeErasure;

public class ParametrizedClass {

    public static void main(String[] args) {

    }
//    public void abc(Info<String> info) { //компилятор запрещает перегрузку этих методов, так как для JVM они выглядят одинаково (даймонд стирается)
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
}

class Info <T> { //так имплементируются интрефейсы в generics
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                "value=" + value +
                '}';
    }
    public T getValue() {
        return value;
    }
}

//class Parent {
//    public void abc(Info<String> info) {
//        String s = info.getValue();
//    }                                       //так перезаписывать тоже запрещается, так как для jvm информация о generics стирается и непонятно метод какого класса вызывается
//}
//class Child extends Parent {
//
//    public void abc(Info<Integer> info) {
//        Integer i = info.getValue();
//    }
//}