package _1compareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        List <Employee> emps = new ArrayList<>();

        Employee emp1 = new Employee(1, "Алмаз", "Залялов", 5000);
        Employee emp2 = new Employee(2, "Гульназ", "Залялова", 2000);
        Employee emp3 = new Employee(3, "Нияз", "Залялов", 1500);

        emps.add(emp1);
        emps.add(emp2);
        emps.add(emp3);

        System.out.println("Before sorting \n" + emps); // \n - перенос строки
        System.out.println(emps);
        Collections.sort(emps);                         // чтобы вызвать метод sort, у коллекции содержащей объекты, нужно имплементировать Comparable<> в классе и перезаписать compareTo
        System.out.println("After sorting \n" + emps);
    }
}
class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
//        if (this.id == o.id) {
//            return 0;
//        }
//        else if (this.id < o.id) {
//            return -1;
//        }
//        else return 1;
//        return this.id - o.id;              // короткое написание
//        return this.id.compareTo(o.id);     // короткое написание, если поле id будет Integer(Integer имплдементирует Comparable)
//        return this.name.compareTo(o.name); //так же можно использовать compareTo для полей типа String
          int res = this.name.compareTo(o.name);
          if (res == 0) {                       //если имена равны, проверяй по фамилиям
              res = this.surname.compareTo(o.surname);
          }
          return  res;
    }
}
// Итерфейс Comparable используется для сортировки элементов коллекции используя естественный порядок