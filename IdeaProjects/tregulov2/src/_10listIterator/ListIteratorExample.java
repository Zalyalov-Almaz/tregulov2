package _10listIterator;

import java.util.*;

public class ListIteratorExample {

    public static void main(String[] args) {
        String s = "madam";
        List <Character> chars = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        ListIterator<Character> chIterator = chars.listIterator();
        ListIterator<Character> reversChIterator = chars.listIterator(chars.size());
        boolean isPolyndrom = true;
        while (chIterator.hasNext() && reversChIterator.hasPrevious()) {
            if (chIterator.next() != reversChIterator.previous()) {
                isPolyndrom = false;
                break;
            }
        }
        if (isPolyndrom) {
            System.out.println("Слово является полиндромом");
        }
        else {
            System.out.println("Слово не является полиндромом");
        }
        System.out.println(chars);
    }
}
