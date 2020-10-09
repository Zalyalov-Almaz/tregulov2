package _3_4subtyping;

public class ParametrizedClass {

    public static void main(String[] args) {
        Info<String> info1 = new Info<>("String");
        System.out.println(info1);
        String s1 = info1.getValue();
        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);
        Integer s2 = info2.getValue();
    }

}

class Info <T> {
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
