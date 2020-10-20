package _12bigOnotation;

import java.util.*;

public class BigOnotationExample {

    public static void main(String[] args) {

        List <Student> strings = new ArrayList<>();

        Student st1 = new Student(1, "Алмаз", 3);
        Student st2 = new Student(2, "Гульназ", 1);
        Student st3 = new Student(3, "Данис", 5);
        Student st4 = new Student(4, "Фаяз", 5);
        Student st5 = new Student(5, "Нияз", 5);

        strings.add(st1);
        strings.add(st2);
        strings.add(st3);
        strings.add(st4);
        strings.add(st5);

        Iterator <Student> it = strings.iterator();

//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        Collections.shuffle(strings);
        Collections.sort(strings);
        Collections.reverse(strings);
        for (Student st : strings) {
            System.out.println(st);
        }
    }
}
class Student implements Comparable<Student> {
    int id;
    String name;
    int course;

    public Student(int id, String name, int course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}