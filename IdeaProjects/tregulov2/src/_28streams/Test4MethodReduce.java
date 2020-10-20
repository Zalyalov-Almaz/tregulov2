package _28streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        int i2 = ints.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(i2);

        List<String> strings = new ArrayList<>();

        strings.add("Привет");
        strings.add("Ок");
        strings.add("Как дела?");
        strings.add("Пока");

        String s = strings.stream().reduce((accumulator, element) -> accumulator + " " + element).get(); //конкатенация
        System.out.println(s);

        List<Integer> ints2 = new ArrayList<>();
        Optional<Integer> optional = ints.stream().reduce((accumulator, element) -> accumulator * element);
        if (optional.isPresent()) { //isPresent возвращает true если optional имеет результат
            System.out.println(optional.get());
        }
        else {
            System.out.println("Not present");
        }
    }
}
// Метод reduce производит математические операции с элементами потока, в данном случае умножение. Параметру accumulator
//присваивается значение первого элемента потока, element'у второго. Дальше выполняется тело метода, значение результата выполнения,
//присваивается accumulator'у. Потом element'у присваивается значение третьего элемента, затем опять выполняется тело метода,
//результат присваивается accumulator'у, element'у присваивается значение 4ого элемента, и так пока поток не закончится
// Если мы передаем в 1ый параметр reduce, какое то число, то начальным значение accumulator будет это число. При таком написании
//не нужно использовать метод get() в конце.