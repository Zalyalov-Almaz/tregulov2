package _28streams;

import java.util.ArrayList;
import java.util.List;

public class Test11MethodFlatMap {

    public static void main(String[] args) {
        Student st1 = new Student("Алмаз", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7.0);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);

        Faculty f1 = new Faculty("Экономика");
        Faculty f2 = new Faculty("Прикладная математика");
        f1.addStudentToFaculty(st1);
        f1.addStudentToFaculty(st2);
        f1.addStudentToFaculty(st3);
        f2.addStudentToFaculty(st4);
        f2.addStudentToFaculty(st5);

        List<Faculty> facultyList = new ArrayList<>();

        facultyList.add(f1);
        facultyList.add(f2);

        facultyList.stream() // преобразовали в поток список факультетов
                .flatMap(faculty -> faculty.getStudentsOnFaculty().stream()) //преобразовали каждый элемент потока факультетов в потоки студентов на этих факультетах
                .forEach(student -> System.out.println(student.getName()));  //для каждого элемента из этих двух потоков, вывели на экран их имена
    }
}
class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<Student>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudentToFaculty(Student st) {
        studentsOnFaculty.add(st);
    }
}
//flatMap используется, когда работаем с коллекцией объектов, которые в своем поле содержат другую коллекцию. Является промежуточным