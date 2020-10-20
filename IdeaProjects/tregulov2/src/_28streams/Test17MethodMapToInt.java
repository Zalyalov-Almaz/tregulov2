package _28streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Test17MethodMapToInt {

    public static void main(String[] args) {
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

        List<Integer> courses = students.stream()
                .mapToInt(s -> s.getCourse())  //mapToInt возвращает поток интов
                .boxed()                       //boxed конвертирует значение int в Integer
                .collect(Collectors.toList()); //создаем список из элементов потока
        int sum = students.stream().mapToInt(s -> s.getCourse()).sum(); //sum суммирует все элементы потока
        System.out.println(sum);
        double average = students.stream().mapToDouble(s -> s.getAvgGrade()).average().getAsDouble();// average возвращает ср арифметич элементов потока
        System.out.println(average);                                                                 // getAsDouble возвращает double
    }
}
//mapToInt промежуточный метод возвращает поток интов