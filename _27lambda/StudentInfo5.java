package _27lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo5 {
    public void printStudentsByCheck(ArrayList<Student> students, Predicate <Student> predicate) {
        for (Student s : students) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
class StudentPrint {
    public static void main(String[] args) {

        Student st1 = new Student("Алмаз", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7.0);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Predicate <Student> pr1 = s -> s.avgGrade > 8.0;
        Predicate <Student> pr2 = s -> s.name.length() >= 5;
        Predicate <Student> pr3 = s -> s.sex == 'm';

        StudentInfo5 si5 = new StudentInfo5();
        si5.printStudentsByCheck(students, pr1);
        si5.printStudentsByCheck(students, pr1.and(pr2).and(pr3)); //объединение условий
        System.out.println("____________________________________");
        si5.printStudentsByCheck(students, pr1.or(pr2).or(pr3));   //если хотя бы одно условие проходит
        System.out.println("____________________________________");
        si5.printStudentsByCheck(students, pr1.negate()); //отрицание условия, метод выведет только тех студентов, которые не проходят по условию
    }
}
//Predicate - готовый интерфейс для функционального программирования, функциональным методом которого является метод boolean test();