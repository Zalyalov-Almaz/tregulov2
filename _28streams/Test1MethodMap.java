package _28streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1MethodMap {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        strings.add("Привет");
        strings.add("Ок");
        strings.add("Как дела?");
        strings.add("Пока");

        List<Integer> ints = strings.stream().map(s -> s.length()).collect(Collectors.toList()); //преобразовали коллекцию в поток (метод stream), методом map
                                                                                                 //преобразовали каждый элемент потока в int
                                                                                                 // (лямбда Function, в теле apply длина каждого элемента)
                                                                                                 // collect(Collectors.toList()) - добаваили каждый преобразованный элемент
                                                                                                 // в коллекцию ints

        for (int i : ints) {
            System.out.println(i);
        }

        int [] array = {5, 9, 3, 8, 1};

        array = Arrays.stream(array).map(i -> {if (i % 3 == 0) {
            i /= 3;
        }
        return i;}).toArray(); //если в случае с коллекциями, мы использовали метод collect(Collectors.toList()), то
                               //то с массивами достаточно toArray()
        System.out.println(Arrays.toString(array));

        Set<String> stringSet = new TreeSet<>();
        stringSet.add("Привет");
        stringSet.add("Ок");
        stringSet.add("Как дела?");
        stringSet.add("Пока");

        Set <Integer> ints2 = stringSet.stream().map(s -> s.length()).collect(Collectors.toSet());

    }
}
//Метод map принимает в параметры некий объект класса, имплементирующего Function