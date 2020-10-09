package _23linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet <Integer> ints = new LinkedHashSet<>(); // в LinkedHashSet элементы хранятся в порядке добавления
        ints.add(5);
        ints.add(3);
        ints.add(1);
        ints.add(8);
        ints.add(10);

        System.out.println(ints);
        ints.remove(8);
        System.out.println(ints);
        System.out.println(ints.contains(10));
    }
}
//LinkedHashSet является наследником HashSet. Хранит информацию о порядке добавления элементов. Производительность методов немного ниже, чем у методов HashSet.
//В основе LinkedHashSet лежит HashMap. У элементов данного HashMap ключи - это элементы LinkedHashSet, а значения - константы заглушки