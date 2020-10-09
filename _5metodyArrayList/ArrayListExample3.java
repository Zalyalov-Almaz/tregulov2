package _5metodyArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample3 {
    public static void main(String[] args) {
        Student student1 = new Student("Алмаз", 'm', 31, 4, 9);
        Student student2 = new Student("Гульназ", 'а', 25, 1, 7);
        Student student3 = new Student("Ильсур", 'm', 33, 5, 6);
        Student student4 = new Student("Рифат", 'm', 26, 3, 4);
        Student student5 = new Student("Азалия", 'f', 19, 1, 8);
        Student student6 = new Student("Азалия", 'f', 19, 1, 8);

        ArrayList <Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        students.remove(student6); //если в классе Student корректно переопределить метод equals, то из students удалится объект у которого все поля равны полям объекта, переданного в параметры
    }

}
class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex &&
                age == student.age &&
                course == student.course &&
                Double.compare(student.avgGrade, avgGrade) == 0 &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}