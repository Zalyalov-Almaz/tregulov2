package _24queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("Алмаз");
        names.add("Гульназ");
        names.add("Рината");
        names.add("Данис");
        names.add("Дина");
        System.out.println(names);
        names.offer("Ильдус"); //offer так же как и add добавляет в очередь элемент, но отличается тем, что add бросает исключение в случае, когда размер очереди ограничен,
                                  //а offer, просто не добавляет ничего
        System.out.println(names);
        System.out.println(names.remove()); //remove возвращает элемент из начала очереди и удаляет его, так же в параметр можно передать любой объект из очереди
                                            //если элементов в очереди не осталось бросает NoSuchElementException
        System.out.println(names.poll()); //poll тоже удаляет элементы, но если элементов не осталось не бросает исключение, а возвращает null
        System.out.println(names.element()); //возвращает первый элемент очереди, если элементов в коллекции не осталось, бросает исключение NoSuchElementException
        System.out.println(names.peek()); //возвращает первый элемент очереди, если элементов в коллекции не осталось, возвращает null



    }
}
//Queue - это коллекция-очередь, хранящая последовательность элементов. Добавляется элемент в конец очереди, используется из начала очереди
//Класс LinkedList имплементирует не только List, но и Deque