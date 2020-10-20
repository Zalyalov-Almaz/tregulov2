package _28streams;

import java.util.ArrayList;
import java.util.List;

public class Test16MethodSkip {

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

        students.stream().filter(s -> s.getAge() > 20).forEach(System.out::println);//выведется весь поток
        System.out.println("------------------------------------");
        students.stream().filter(s -> s.getAge() > 20).limit(2).forEach(System.out::println);//limit(2) - выведуться только первые 2 элемента потока
        System.out.println("------------------------------------");
        students.stream().filter(s -> s.getAge() > 20).skip(2).forEach(System.out::println);//skip(2) - выведутся все элементы потока, кроме первых двух
    }
}
//limit skip промежуточные методы