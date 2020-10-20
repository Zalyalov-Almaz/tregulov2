package _24queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue <Integer> ints = new PriorityQueue<>();
        ints.add(4);
        ints.add(1);
        ints.add(7);
        ints.add(10);
        ints.add(8);
        System.out.println(ints.peek()); //возвращает элемент с наивысшим приоритетом, то есть тот, что самый маленький (compareTo)
        System.out.println(ints.remove()); //возвращает и удаляет элемент с наивысшим приоритетом

    }
}
//PriorityQueue - специальный вид очереди, в котором используется натуральная сортировка или та, которую мы описываем
//имплементацией Compareable или Comparator. Таким образом используется тот элемент очереди, приоритет которого выше