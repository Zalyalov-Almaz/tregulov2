package _28streams;

import java.util.stream.Stream;

public class Test7MethodConcat {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2); // concat соединяет
        stream3.forEach(System.out::println);   //1, 2, 3, 4, 5, 6, 7, 8, 9, 10

    }
}
// Метод concat не терминальный, но после него уже нельзя вызывать промежуточных методов