package _5metodyArrayList;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<String>();
        strings.add("Алмаз");
        strings.add("Иван");
        strings.add("Мария");
        strings.add(1, "Петр"); //добавляем строку "Петр" на индекс 1, при этом "Иван" не сотрется, а просто встанет на 2ой индекс
        strings.set(1, "Петя"); //set заменяет элемент на указанном индексе, на переданный в параметр
        strings.remove(0); //remove удаляет элемент списка по индексу или ссылке
    }
}
