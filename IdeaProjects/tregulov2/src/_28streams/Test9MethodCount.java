package _28streams;

import java.util.stream.Stream;

public class Test9MethodCount {

    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);

//        System.out.println(stream1.count());
        System.out.println(stream1.distinct().count()); //выодим на экран количество уникальных элементов в потоке, если не закоментировать
                                                        //строчку выше будет брошено исключение, так как один поток нельзя переиспользовать несколько раз
    }
}
// count считает количество элементов в потоке и возвращает long