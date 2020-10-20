package _28streams;

import java.util.stream.Stream;

public class Test8MethodDistinct {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream1.distinct().forEach(System.out::println);

    }
}
// distinct - промежуточный метод, возвращающий поток из уникальных элементов, то есть все повторения удаляются.
//Для проверки на уникальность distinct использует equals