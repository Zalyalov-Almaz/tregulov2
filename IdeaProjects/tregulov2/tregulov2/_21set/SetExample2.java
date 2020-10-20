package _21set;

import java.util.HashSet;

public class SetExample2 {

    public static void main(String[] args) {
        HashSet <Integer> ints = new HashSet<>();

        ints.add(5);
        ints.add(7);
        ints.add(4);
        ints.add(9);
        ints.add(2);

        HashSet <Integer> ints2 = new HashSet<>();

        ints2.addAll(ints);

        HashSet <Integer> ints3 = new HashSet<>();

        ints3.add(2);
        ints3.add(7);
        ints3.add(5);
        ints3.add(6);
        ints3.add(8);
//        ints3.retainAll(ints2); //retainAll возвращает множекство значений встречающихся в обоих множествах
        ints3.removeAll(ints); // удаляет все не уникальные для обоих коллекций элементы из вызвавшей
        System.out.println(ints3) ;

    }
}
