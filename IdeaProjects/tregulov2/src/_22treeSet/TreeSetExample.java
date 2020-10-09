package _22treeSet;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Student> ints = new TreeSet<>(); //TreeSet хранит элементы в отсортированном виде

        ints.add(new Student("Алмаз", 3));
        ints.add(new Student("Гульназ", 5));
        ints.add(new Student("Данис", 4));
        ints.add(new Student("Равиль", 1));
        ints.add(new Student("Василий", 6));
//        ints.add(null); //вызывает NullPointerException

        System.out.println(ints);
        System.out.println(ints.first()); //возвращает самый маленький элемент
        System.out.println(ints.last()); //возвращает самый большой элемент
        System.out.println(ints.headSet(new Student("Равиль", 1)));// возвращает

    }
}
class Student implements Comparable <Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.course - o.course;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
//Если перезапись методов корректна, то при том, что equals возвращает true, compareTo должен возвращаеть 0