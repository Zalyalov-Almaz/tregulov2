package _4collections;

import java.util.ArrayList;

public class ArrayListExample1 {

    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<String>();
        strings.add("Алмаз");
        strings.add("Иван");
        strings.add("Мария");

        System.out.println(strings);

        ArrayList <Integer> ints = new ArrayList<>(200); //объявили и разместили список вместимостью 200 элементов

        ArrayList <String> strings2 = new ArrayList<>(strings); //сразу поместили в strings2 все элементы strings
    }
}
