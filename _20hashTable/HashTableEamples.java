package _20hashTable;

import _3_3primerNaGenerics.Student;

import java.util.Hashtable;

public class HashTableEamples {

    public static void main(String[] args) {
        Hashtable <Double, Student>  htb = new Hashtable<>();
        Student st1 = new Student("Алмаз Залялов", 31);
        Student st2 = new Student("Заур Трегулов", 34);
        Student st3 = new Student("Игорь Иванов", 25);
        Student st4 = new Student("Сергей Петров", 39);
        htb.put(9.4, st1);
        htb.put(9.1, st2);
        htb.put(7.3, st3);
        htb.put(5.4, st4);
        System.out.println(htb);

    }
}
// В HashTable ни ключ, ни значение не мгут быть null. Работает так же как и HashMap, но все методы synchronized