package _27lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List <String> list = List.of("Привет", "Как дела?", "Нормально", "Пока");
//
//        for (String s : list) {
//            System.out.println(s);
//        }
//        list.forEach(s -> System.out.println(s));
        List <Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        ints.forEach(i -> {
            System.out.println(i);
            i *= 2;
            System.out.println(i);
        });
    }
}
// Интерфейс Consumer используется методом forEach