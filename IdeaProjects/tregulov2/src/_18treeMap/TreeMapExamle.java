package _18treeMap;


import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExamle {

    public static void main(String[] args) {
        TreeMap <Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Алмаз", "Залялов", 3);
        Student st2 = new Student("Гульназ", "Залялова", 5);
        Student st3 = new Student("Нияз", "Залялов", 2);
        Student st4 = new Student("Саит", "Залялов", 1);
        Student st5 = new Student("Марат", "Ситдиков", 6);
        Student st6 = new Student("Дмитрий", "Мухамадеев", 3);
        Student st7 = new Student("Руслан", "Фахардынов", 4);
        Student st8 = new Student("Руслан", "Фахардынов", 4);

        treeMap.put(9.4, st1);
        treeMap.put(5.8, st7);
        treeMap.put(7.2, st2);
        treeMap.put(7.9, st4);
        treeMap.put(7.5, st3);
        treeMap.put(5.3, st6);
        treeMap.put(7.3, st5);

        treeMap.put(8.8, st8);

        System.out.println(treeMap); //treeMap отсортированная коллекция (сортировка по ключу)

        treeMap.remove(st1);//удалялет значение по ключу или по паре
        treeMap.descendingMap();//пересортировывают коллекцию так чтобы элементы шли по убыванию ключей
        treeMap.tailMap(7.1); //выделяет пары, ключи которых больше, чем переданный в параметр
        treeMap.headMap(8.7); //выделяет пары, ключи которых меньше, чем переданный в параметр
        treeMap.lastEntry(); //возвращает последнюю пару (с самым большим ключом)
        treeMap.firstEntry(); //возвращает первую пару (с самым маленьким ключом)
    }
}

class Student implements Comparable<Student>{
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
            return result;
    }
}
//Элементами TreeMap являются пары ключ/значение, отсортированные по возрастанию по ключу
//В основе TreeMap лежит красно-черное дерево. Это позволяет методам работать быстро, но не быстрее чем в HashMap