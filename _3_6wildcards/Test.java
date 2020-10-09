package _3_6wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        //    List <Number> list = new ArrayList<Integer>(); мы помним, что так писать нельзя
        List<?> list = new ArrayList<Integer>(); //так писать можно ? - символ wildcard
//        list.add("hello"); компилятор запрещает вызывать методы, которые могут менять объект
        List <? extends Number> list2 = new ArrayList<Integer>(); //так писать можно, таким образом мы ограничиваем диапазон wildcard (wildcard bounding)

        ArrayList <Double> doubles = new ArrayList<>();
        doubles.add(3.14);
        doubles.add(3.15);
        doubles.add(3.16);
        shoeListInfo(doubles);

        List <String> strings = new ArrayList<>();
        strings.add("3.14");
        strings.add("3.15");
        strings.add("3.16");
        shoeListInfo(strings);

        ArrayList <Integer> ints = new ArrayList<>();
        ints.add(3);
        ints.add(35);
        ints.add(36);
        shoeListInfo(ints);

        System.out.println(summ(ints));
    }



    static void shoeListInfo(List<?> list) { //то есть этот метод можно использовать для любого списка, с элементами любого типа
        System.out.println("Мой список содежит следующие элементы:" + list);
    }
    public static double summ(List<? extends Number> al) {
        double summ = 0;
        for (Number n : al) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
// вместо wildcard можно подставить абсолютно любой тип данных