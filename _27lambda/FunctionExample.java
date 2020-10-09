package _27lambda;

import java.util.ArrayList;
import java.util.List;
import  java.util.function.Function;

public class FunctionExample {
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

        StudentInfo si = new StudentInfo();

        Function<Student, Double> f = s -> s.avgGrade;
        double res = avgOfSmth(students, (Student s) -> s.avgGrade);

    }
    private static double avgOfSmth (List<Student> list, Function <Student, Double> function) {
        double result = 0;

        for (Student st : list) {
            result += function.apply(st);
        }
        result /= list.size();
        return result;
    }
}
// Function нужен когда нужно принимать в параметр один тип данных (в данном случае Student), а на выходе возвращать другой
//например Predicate возвращает только boolean, Supplier ничего не принимает в параметры, а Consumer ничего не возвращает,
//а Function принимает в параметры все что угодно и возвращает что угодно