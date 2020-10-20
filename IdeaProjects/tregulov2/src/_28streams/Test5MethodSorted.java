package _28streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test5MethodSorted {

    public static void main(String[] args) {
        int [] array = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        array = Arrays.stream(array).sorted().toArray(); //сортировка массива с помощью потока, в конце преобразуем поток обратно в массив.
        for (int i : array) {
            System.out.println(i);
        }

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

        students = students.stream().sorted((s1, s2) -> s1.getAge() - s2.getAge()).collect(Collectors.toList()); // лямбда в параметре sorted - compare из Comparator
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
