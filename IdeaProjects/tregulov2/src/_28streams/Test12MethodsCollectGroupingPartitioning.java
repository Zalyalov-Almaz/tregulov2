package _28streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test12MethodsCollectGroupingPartitioning {

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

//        Map<Integer, List <Student>> map = students.stream().map(student -> {student.setName(student.getName().toUpperCase()); // --1--
//                          return student;})
//                         .collect(Collectors.groupingBy(student -> student.getCourse())); // --2--
//
//        for (Map.Entry <Integer, List <Student>> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
        Map<Boolean, List<Student>> map = students.stream()
                .collect(Collectors.partitioningBy(student -> student.getAvgGrade() > 7.0)); // partitioningBy принимает в параметры Predicate, то Map будет содержать пары с ключами
                                                                                             //false или true

        for (Map.Entry <Boolean, List <Student>> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
// --1-- Преобразовали список студентов в поток, с помощью метода map изменили имена студентов, вернули студентов в поток
// --2-- Метод collect собирает коллекцию, какая коллекция - определяется в параметре. groupingBy(student -> student.getCourse()) группирует студентов по курсу

// groupingBy - метод группирующий студентов по параметру
// partitioningBy - метод разделяющий студентов на две коллекции по параметру