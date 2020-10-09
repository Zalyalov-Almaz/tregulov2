package _28streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test4MethodReduce {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(8);
        ints.add(2);
        ints.add(4);
        ints.add(3);

        int i = ints.stream().reduce((accumulator, element) -> accumulator * element).get(); // Без get() все это не сработает
        System.out.println(i);

        kdjfalsflshd
    }
}
// Метод reduce производит математические операции с элементами потока, в данном случае умножение. Параметру accumulator
//присваивается значение первого элемента потока, element'у второго. Дальше выполняется тело метода, значение результата выполнения,
//присваивается accumulator'у. Потом element'у присваивается значение третьего элемента, затем опять выполняется тело метода,
//результат присваивается accumulator'у, element'у присваивается значение 4ого элемента, и так пока поток не закончится