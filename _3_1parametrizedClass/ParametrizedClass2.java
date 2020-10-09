package _3_1parametrizedClass;

public class ParametrizedClass2 {

    public static void main(String[] args) {
        Pair <String, Integer> pair = new Pair<>("String", 25);
        System.out.println("Value1 = " + pair.getFirstValue() + "\n" + "Value2 = " + pair.getSecondValue());
        Pair <Integer, Double> pair2 = new Pair<>(35, 25.05);
        System.out.println("Value1 = " + pair2.getFirstValue() + "\n" + "Value2 = " + pair2.getSecondValue());
        Pair2 <Integer> pair3 = new Pair2<>(45, 25);
    }

}
class Pair <V1, V2> {

    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getFirstValue() {
        return value1;
    }
    public V2 getSecondValue() {
        return value2;
    }
}
class Pair2 <V> {

    private V value1;
    private V value2;

    public Pair2(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getFirstValue() {
        return value1;
    }
    public V getSecondValue() {
        return value2;
    }
}