package _11binarySirch;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySirch {

    public static void main(String[] args) {

        ArrayList <Integer> ints = new ArrayList<>();

        ints.add(-3);
        ints.add(8);
        ints.add(12);
        ints.add(-8);
        ints.add(0);
        ints.add(5);
        ints.add(10);
        ints.add(1);
        ints.add(150);
        ints.add(-30);
        ints.add(19);
        Collections.sort(ints); // сортирует коллекцию по естественному порядку
        Collections.reverse(ints); // сортирует в порядке убывания коллекцию отсортированную в порядке возрастания
        Collections.shuffle(ints); // перемешивает элементы коллекции в случайном порядке
        System.out.println(ints);
//
//        int index = Collections.binarySearch(ints, 12); // если возвращает индекс элемента, корректно работает толькос отсортированной коллекцией
//        System.out.println(index);                          // если элемент не найден, возвращает отрицательное число
//        Employee emp1 = new Employee(1, "Алмаз", 5000);
//        Employee emp2 = new Employee(2, "Гульназ", 900);
//        Employee emp3 = new Employee(3, "Фаяз", 1500);
//        Employee emp4 = new Employee(4, "Данис", 4000);
//        Employee emp5 = new Employee(5, "Нияз", 2000);
//        Employee emp6 = new Employee(6, "Саит", 3000);
//        Employee emp7 = new Employee(7, "Аяз", 500);
//
//        List <Employee> emps = new ArrayList<>();
//        emps.add(emp4);
//        emps.add(emp5);
//        emps.add(emp6);
//        emps.add(emp7);
//        emps.add(emp1);
//        emps.add(emp2);
//        emps.add(emp3);
//
//        System.out.println(emps);
//        Collections.sort(emps);
//        System.out.println(emps);
//
//        System.out.println(Collections.binarySearch(emps, new Employee(1, "Алмаз", 5000))); // binarySearch возвращает индекс работника с определенными параметрами
//                                                                                                            //поиск идет с помощью compareTo
//        int [] ints = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19}; // у классических массивов тоже есть метод binarySearch (в классе Arrays)
//        Arrays.sort(ints);
//        System.out.println(Arrays.binarySearch(ints,0));
    }
}

class Employee implements Comparable<Employee> {

    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        int result = this.id - employee.id;
        if (result == 0) {
            result = this.name.compareTo(employee.name);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}