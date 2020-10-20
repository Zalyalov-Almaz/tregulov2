package _28streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6MethodChaining {

    public static void main(String[] args) {

        // --1--
        int [] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};

        int i = Arrays.stream(array).filter(element -> (element % 2) == 1).map(element -> {if (element % 3 == 0) {element /= 3;} return element;}).reduce((a, e) -> a + e).getAsInt();
        System.out.println(i);

        // --2--
        Student st1 = new Student("Алмаз", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7.0);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students.stream().map(element -> {element.setName(element.getName().toUpperCase()); return element;})
                         .filter(element -> element.getSex() == 'f')
                         .sorted((x,y) -> x.getAge() - y.getAge())
                         .forEach(System.out::println);

    }
}
// --1-- Отфильтруем поток так, чтобы в нем остались только нечетные числа, потом из оставшихся чисел поделим на 3 только те, которые делятся на 3 без остатка, и сложим все элементы
// --2-- Имена всех студентов сделаем с большой буквы, отфильтруем студентов так, чтобы остались только девушки, отсуортируем по возрасту, выведем всех на экран
// Берем массив или коллекцию, преобразуем его в поток, начинаем в требующейся очереди вызывать промежуточные (lazy/intermediate) методы (методы которые что-то делают с элементами
//и возвращают их в поток). Дальше вызывается терминальный (eager/terminal) метод, который возвращает какой-то тип данных, в который преобразует поток. Промежуточные методы не работают
//до тех пор пока мы не вызовем в конце трминальный метод. Таким образом, вызвав терминальный метод, мы не можем после него вызывать промежуточные. Терминальные методы возвращают либо
//void либо что-то, что не является потоком. map, filter, sorted - промежуточные методы, forEach, reduce - терминальные.