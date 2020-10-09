package _8Iterator;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("Алмаз");
        strings.add("Иван");
        strings.add("Мария");

        Iterator <String> it = strings.iterator();

        while (it.hasNext()) {  //возвращает true если, итерация не достигла конца коллекции
            System.out.println(it.next());
            it.next();      //возвращает очередной элемент коллекции
            it.remove();    //удаляет элемент коллекции
        }
    }
}
