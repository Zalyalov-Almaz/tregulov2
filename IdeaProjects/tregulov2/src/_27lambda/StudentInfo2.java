package _27lambda;

import java.util.ArrayList;

public class StudentInfo2 {

    void testStudents(ArrayList<Student> st, StudentsChecks sc) { //2ой параметр некий объект класса, который имплементирует StudentsChecks (можно было CheckOverGrade sc)
        for (Student s : st) {  // Для кадого студента из коллекции st
            if(sc.check(s)) {     // Если check возвращает true - выводи его на экран
                System.out.println(s);
            }
        }
    }

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

        StudentInfo2 si2 = new StudentInfo2();
        //si2.testStudents(students, new CheckOverGrade());   //вызываем метод testStudents на каждого студента из коллекции students
//        si2.testStudents(students, new StudentsChecks() {   //вмсето new CheckOverGrade() передаем 2ым параметром анонимный класс имплементирующий StudentsChecks
//            @Override                                       //тогда никаких дополнительных классов, имплементирующих StudentsChecks писать не нужно (CheckOverGrade)
//            public boolean check(Student s) {
//                return s.age < 25;        //здесь по умолчанию будет return false, но мы можем указать любой фильтр какой захотим
//            }
//        });
        si2.testStudents(students, (Student s) -> {return s.age < 30;}); //лямбда выражение, укорачивает код, при этом нужен только интерфейс.
                                                                         // Ни анонимных, ни каких-либо других доп классов не требуется.
        si2.testStudents(students, (Student s) -> {return s.avgGrade > 5.0 && s.age > 20 && s.course > 2;}); // можно настраивать фильтр как угодно
    }
}
interface StudentsChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentsChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 6.0;
    }
}
// Лямбда выражения работатют с интерфейсом, в котором только один абстрактный метод. Такие интерфейсы называются функциональными, т.е. интерфейсы пригодные
//для функционального программирования.
// Пишем интерфейс с одним абстрактным методом (функциональный интерфейс), потом пишем в исполняющем классе метод принимающий в параметры некий объект класса имплементирующего
//наш функциональный интерфейс, при написании лямда выражения, вмсето объект класса имплементирующего наш функциональный интерфейс, пишем параметр метода из интерфейса, ставим стрелку
// и пишем тело метода, как хотим.