package _19linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Objects;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap<>(16, 0.75f, false);
        Student st1 = new Student("Алмаз", "Залялов", 3);
        Student st2 = new Student("Гульназ", "Залялова", 5);
        Student st3 = new Student("Нияз", "Залялов", 2);
        Student st4 = new Student("Саит", "Залялов", 1);
        Student st5 = new Student("Марат", "Ситдиков", 6);
        Student st6 = new Student("Дмитрий", "Мухамадеев", 3);
        Student st7 = new Student("Руслан", "Фахардынов", 4);
        Student st8 = new Student("Руслан", "Фахардынов", 4);

        linkedHashMap.put(9.4, st1); // в LinkedHashMap элементы содержаться в порядке добавления
        linkedHashMap.put(5.8, st7);
        linkedHashMap.put(7.2, st2);
        linkedHashMap.put(7.9, st4);
        linkedHashMap.put(7.5, st3);
        linkedHashMap.put(5.3, st6);
        linkedHashMap.put(7.3, st5);
    }
}
class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
        return result;
    }
}
