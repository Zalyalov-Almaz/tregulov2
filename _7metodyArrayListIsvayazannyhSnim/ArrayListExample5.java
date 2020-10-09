package _7metodyArrayListIsvayazannyhSnim;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("Алмаз");
        strings.add("Иван");
        strings.add("Мария");

        System.out.println(strings);

        ArrayList <String> strings2 = new ArrayList<>();
        strings2.add("Гульназ");
        strings2.add("Нияз");
        strings2.add("Данис");

        strings.removeAll(strings2); //удаляет из strings все элементы содержащиеся в strings2
        strings.retainAll(strings2); //удаляет из strings все элементы, не содержащиеся в strings2
        strings.containsAll(strings2); //возвращает true, если в strings содержаться все элементы, содержащиеся в strings2
        List<String> strings3 = strings.subList(0, 3); //subList создает ссылку на кусок из strings. Изменения в strings3 отражаются на strings, но если изменить strings, то при попытке например
                                                        //вывести на экран strings3 вылетит исключение
        String [] array = strings.toArray(new String [5]); //toArray возвращает массив типа Object, если нужно получить массив определенного типа, то в параметр надо передать конструктор
                                                            //этого типа
        List<Integer> list = List.of(3, 8, 1); //статический метод List.of возвращает список с элементами переданными в параметры, полученный список неизменяем.
                                                // При попытке изменить вылетит исключение UnsupportedOperationException
        List<String> list2 = List.copyOf(strings); //возвращает неизменяемую копию коллекции переданной в параметр

    }

}
