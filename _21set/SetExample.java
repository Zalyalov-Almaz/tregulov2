package _21set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Алмаз");
        stringSet.add("Заур");
        stringSet.add("Марина");
        stringSet.add("Игорь");
//        stringSet.add("Игорь");//это не добавится, так как элемент Игорь уже есть в коллекции
        stringSet.remove("Заур");
        stringSet.isEmpty();
//        System.out.println(stringSet);
        for (String s : stringSet) {
            System.out.println(s);
        }
    }
}
