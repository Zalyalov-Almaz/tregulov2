package _16equalsIhashcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeExample1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();

        Student st1 = new Student("Алмаз", "Залялов", 3);
        Student st2 = new Student("Гульназ", "Залялова", 5);
        Student st3 = new Student("Нияз", "Залялов", 4);

        map.put(st1, 9.4);
        map.put(st2, 7.3);
        map.put(st3, 8.5);

        Student st4 = new Student("Алмаз", "Залялов", 3);
        Student st5 = new Student("Игорь", "Ситдоров", 2);
        boolean result = map.containsKey(st4);
        System.out.println("result = " + result);

        for (Map.Entry <Student, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}

class Student {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
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
//    @Override
//    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + course * 53;
//    }
}
// Если вы переопределили equals, то переопределите и hashcode
// Результат нескольких выполнений метода hashcode для одного и того же объекта должен быть одинаковым
// Если согласно методу equals 2 объекта равны, то и hashcode у этих объектов должен быть обязательно одинаковым
// Если согласно методу equals 2 объекта не равны, то hashcode у этих объектов не обязательно должен быть разным
// Ситуация когда у разных объектов hashcode оказывается одинаковым, называется коллизией. Чем ее меньше тем лучше