package _27lambda;

import java.util.ArrayList;

public class StudentInfo4 {

    public void printStudentsByCheck(ArrayList <Student> students, StudentCheck student) {
        for (Student s : students) {
            if (student.check(s)) {
                System.out.println(s);
            }
        }
    }
}
interface StudentCheck {
    boolean check(Student s);
}

class StudentsPrint {
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
        si4.printStudentsByCheck(students, (Student s) -> {return s.avgGrade > 5.0;}); //более полное написание лямбда выражения
        si4.printStudentsByCheck(students, (Student s) -> s.avgGrade > 6.0); //смешанное написание, слева от -> полный параметр, справа короткое тело
        si4.printStudentsByCheck(students, s -> {return s.age > 18;});//слева короткое написание, справа полное тело
        StudentCheck sc5 = (s -> s.sex == 'm'); // можно вынести лямбда выражение в переменную типа интерфейса, потом подставить эту переменную куда нужно
//        Collections.sort(students, new Comparator<Student>() { //сортировка студентов с помощью анонимного класса
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.course - o2.course;                   //сортировка по курсу, анонимный класс
//            }
//        });
//        Collections.sort(students, (o1, o2) -> {return o1.course - o2.course;}); //сортировка с помощью лямбда выражения
    }
}
// В лямбда выражении оператор "стрелка" (->) разделяет параметры метода из интерфейса и тело этого же метода
// Если справа от -> вы пишете полное написание, то вы должны писать {return и ";"}
// Слева от -> можно писать короткое написание без скобок, только если метод интерфейса принимает только один параметр,
//если паратметров больше, можно писать только имена переменных, но в ().
// Если в правой части выражения вы пишете более одного стейтмента, то вы должны писать правую часть в полном виде