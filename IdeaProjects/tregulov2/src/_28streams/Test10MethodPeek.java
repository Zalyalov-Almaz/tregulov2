package _28streams;

import java.util.stream.Stream;

public class Test10MethodPeek {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

        System.out.println(stream1.distinct().peek(System.out::println).count()); // убрали неуникальные элементы из потока(distinct()), вывели поток на экран поэлементно,
                                                                                  //вывели на экран количество элементов в конечном потоке
    }
}
// Этот метод принимает в параметр Consumer, но в отличие от  forEach, возвращает не void, в Stream. Является промежуточным
