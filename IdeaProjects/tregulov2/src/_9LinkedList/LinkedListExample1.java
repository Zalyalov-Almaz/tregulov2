package _9LinkedList;

import java.util.LinkedList;

public class LinkedListExample1 {

    public static void main(String[] args) {
        Student st1 = new Student("Алмаз1");
        Student st2 = new Student("Алмаз2");
        Student st3 = new Student("Алмаз3");
        Student st4 = new Student("Алмаз4");
        Student st5 = new Student("Алмаз5");

        LinkedList <Student> students = new LinkedList<Student>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students.get(2));

        Student st6 = new Student("Алмаз6");
        Student st7 = new Student("Алмаз7");

        students.add(st6);
        students.add(2, st7); // добавили st7 на индекс 2
        System.out.println(students);
        students.remove(); //без параметров удаляет нулевой элемент, в параметр можно передать индекс или ссылку на объект
    }
}
class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}