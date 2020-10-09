package _28streams;

import java.util.Arrays;

public class Test3ForEach {

    public static void main(String[] args) {
        int [] array = {5, 9, 3, 8, 1};

        Arrays.stream(array).forEach(i -> {i *= 2; //так как метод forEach ничего не возвращает, мы не можем присвоить результат этого кода какой-либо переменной
            System.out.println(i);});

        Arrays.stream(array).forEach(System.out::println); // Если нужно просто вывести на экран - можно использовать такое простое написание. Тут говорится:
                                                           //println находиться в System.out , подставь каждый элемент потока в параметры println
        Arrays.stream(array).forEach(Utils::myMethod);     // Аналог вышеописанного написания, для класса и метода написанного вручную

    }
}
//Метод forEach пробегает по элементам массива или коллекции и делает с ними то, что передано в параметры

class Utils {
    public static void myMethod(int i) {
        i += 5;
        System.out.println("Элемент равен " + i);
    }


}
// Написание лямбда выражений с "::" - для короткого написания статических методов в параметрах forEach