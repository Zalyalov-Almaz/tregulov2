package _6metodyArrayList2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Алмаз");
        strings.add("Иван");
        strings.add("Мария");

        System.out.println(strings);

        ArrayList<String> strings2 = new ArrayList<String>();
        strings2.add("!!!");
        strings2.add("???");

        strings2.addAll(strings); //addAll добавляет все элменты списка, переданного в параметры в начало списка
        strings2.addAll(1, strings); //addAll добавляет все элменты списка, переданного в параметры, начиная с индекса, переданного в параметры
//        strings2.clear(); //очищает список
//        strings2.add(null);

        System.out.println(strings2);
        System.out.println(strings2.indexOf("Мария")); //indexOf возвращает индекс элемента переданного в парметры (первое совпадение), если это ссылка на объект написанного класса,
                                                       //то в этом классе должен быть перезаписан метод equals
        System.out.println(strings2.lastIndexOf("Мария")); //lastIndexOf возвращает  индекс элемента переданного в парметры (последнее совпадение)
        System.out.println(strings2.size()); //возвращает размер списка
        System.out.println(strings.isEmpty()); //возвращает true если список пуст, список не считается пустым, если в нем есть хотя бы даже null
        System.out.println(strings.contains("Алмаз")); //возвращает true если в списке есть объект эквивалентный переданному(необходима перезапись метода equals)
    }
}
