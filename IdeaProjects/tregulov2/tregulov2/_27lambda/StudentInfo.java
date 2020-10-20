package _27lambda;

import java.util.ArrayList;

public class StudentInfo {

    public static void main(String[] args) {
        Student st1 = new Student("Алмаз", 'm', 22, 3, 8.3);
        Student st2 = new Student("Николай", 'm', 28, 2, 6.4);
        Student st3 = new Student("Елена", 'f', 19, 1, 8.9);
        Student st4 = new Student("Петр", 'm', 35, 4, 7.0);
        Student st5 = new Student("Мария", 'f', 23, 3, 9.1);

        ArrayList <Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo si = new StudentInfo();
        si.printStudentOverGrade(students,8.0);
//        si.printStudentUnderAge(students,25);
//        si.printStudentMixCondition(students,30, 7.0, 'f');
    }
    public void printStudentOverGrade(ArrayList<Student> students, double grade) {
        for (Student s : students) {
            if (s.avgGrade > grade) {
                System.out.println(s);
            }
        }
    }
    public void printStudentUnderAge(ArrayList<Student> students, int age) {
        for (Student s : students) {
            if (s.age > age) {
                System.out.println(s);
            }
        }
    }
    public void printStudentMixCondition(ArrayList<Student> students, int age, double garde, char sex) {
        for (Student s : students) {
            if (s.age > age && s.avgGrade > s.avgGrade && s.sex == sex) {
                System.out.println(s);
            }
        }
    }
}
// В этой программе реализованы методы фильтры, которые позволяют отфильтровать студентов по определнным параметрам