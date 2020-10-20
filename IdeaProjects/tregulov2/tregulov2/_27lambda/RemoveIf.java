package _27lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {

    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<>();

        strings.add("Привет");
        strings.add("Пока");
        strings.add("Ок");
        strings.add("Java");
        strings.add("Lambda");

        strings.removeIf(s -> s.length() > 4); //метод removeIf пробегается по всей коллекции и удаляет все что написано в параметрах
        System.out.println(strings);
        Predicate <String> pr = s -> s.length() > 3; //если требуется использовать это выражение многократно, можно вынести ее в переменную типа Predicate
        strings.removeIf(pr);
    }
}
