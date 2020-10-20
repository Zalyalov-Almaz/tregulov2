package _27lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {
    public void printStudentsByCheck(ArrayList <Student> students, Predicate <Student> pr) { //если раньше мы писали сюда переменную интерфейса, написанного вручную, то теперь используем
        for (Student s : students) {                                                         //готовый интерфейс Predicate
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}
class StudentsPrint2 {
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

        StudentInfo4 si4 = new StudentInfo4();

        si4.printStudentsByCheck(students, s -> s.course > 2); //короткое написание лямбда выражения, все понимание берется из методов написанных заранее до этого
        System.out.println("____________________________________");
        si4.printStudentsByCheck(students, (Student s) -> {return s.avgGrade > 5.0;}); //более полное написание лямбда выражения
        System.out.println("____________________________________");
        si4.printStudentsByCheck(students, (Student s) -> s.avgGrade > 6.0); //смешанное написание, слева от -> полный параметр, справа короткое тело
        System.out.println("____________________________________");
        si4.printStudentsByCheck(students, s -> {return s.age > 18;});//слева короткое написание, справа полное тело
        StudentCheck sc5 = (s -> s.sex == 'm'); // можно вынести лямбда выражение в переменную типа интерфейса, потом подставить эту переменную куда нужно
        System.out.println("____________________________________");
        si4.printStudentsByCheck(students, sc5);
    }
}
// Готовый интерфейс Predicate избавляет нас от необходимости писать вручную функциональные интерфейсы, возвращающие boolean. Функциаональный метод boolean test(T t)