package _24queue;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueExample2 {

    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>();
        Student st1 = new Student("Алмаз", 3);
        Student st2 = new Student("Михаил", 1);
        Student st3 = new Student("Игорь", 2);
        Student st4 = new Student("Мария", 3);
        Student st5 = new Student("Ольга", 4);

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);



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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(@NotNull Student o) {
        int result = this.course - o.course;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}