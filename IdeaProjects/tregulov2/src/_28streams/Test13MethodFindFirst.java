package _28streams;

import java.util.ArrayList;
import java.util.List;

public class Test13MethodFindFirst {

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

        Student st = students.stream().map(element -> {element.setName(element.getName().toUpperCase()); return element;})
                .filter(element -> element.getSex() == 'f')
                .sorted((x,y) -> x.getAge() - y.getAge())
                .findFirst().get();
        System.out.println(st);
    }
}
// findFirst() - возвращает первый элемент потока