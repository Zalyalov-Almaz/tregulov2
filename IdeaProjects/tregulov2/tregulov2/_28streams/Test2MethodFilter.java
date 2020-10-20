package _28streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2MethodFilter {

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

        List<Student> students1 = students.stream().filter(s -> s.getAvgGrade() < 7.5).collect(Collectors.toList());
        //Метод filter() принимает в параметры некий объект класса, имплементирующего интерфейс Predicate. Таким образом можно коллекцию передать в поток
        //и передать поток в другую коллекцию, отфильтровав элементы, как нужно

//        for (Student s : students1) {
//            System.out.println(s);
//        }
        Stream<Student> studentStream = Stream.of(st1, st2, st3, st4, st5); //таким образом поток studentStream содержит (st1, st2, st3, st4, st5)
        studentStream.filter(s -> s.getAge() > 20).collect(Collectors.toList()); // теперь на эту переменную можно вызывать методы интерфейса Stream
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

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public char getSex() { return sex; }

    public void setSex(char sex) { this.sex = sex; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public int getCourse() { return course; }

    public void setCourse(int course) { this.course = course; }

    public double getAvgGrade() { return avgGrade; }

    public void setAvgGrade(double avgGrade) { this.avgGrade = avgGrade; }
}