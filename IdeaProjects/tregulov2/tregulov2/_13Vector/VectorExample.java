package _13Vector;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        Vector<String> stringVector = new Vector<>();

        stringVector.add("Алмаз");
        stringVector.add("Миша");
        stringVector.add("Олег");
        stringVector.add("Катя");

        System.out.println(stringVector);
        System.out.println(stringVector.firstElement());
        System.out.println(stringVector.lastElement());
        stringVector.remove(2);
        System.out.println(stringVector);
        System.out.println(stringVector.get(1));
    }
}
