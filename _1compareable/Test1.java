package _1compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {

        List <String> list = new ArrayList<>();

        list.add("Алмаз");
        list.add("Нияз");
        list.add("Гульназ");

        System.out.println("Перед сортировкой");
        System.out.println(list);
        System.out.println("После сортировки");
        Collections.sort(list);
        System.out.println(list);
    }
}
// В случае, если коллекция содержит строки, сортировка происходит лексиграфически, если числа - в порядке возрастания