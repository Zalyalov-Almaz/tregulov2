package _3genercs;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List <String> list = new ArrayList<>(); //в такой список можно добавлять любые объекты, но так обычно никто не делает
//      list.add("ok");
//      list.add(5);
//      list.add(new StringBuilder("Hello"));
//      list.add(new Car());
        list.add("Hello");
        list.add("Buy");
        list.add("ok");
        list.add("No");

        for (Object o : list) {
            System.out.println(o + " Длина " + ((String) o).length());
        }
    }
}
class Car {

}
// Благодаря Generics интерфейсы коллекций были написаны один раз