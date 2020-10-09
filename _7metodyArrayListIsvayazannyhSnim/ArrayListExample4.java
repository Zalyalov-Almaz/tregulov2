package _7metodyArrayListIsvayazannyhSnim;

import java.util.Arrays;
import java.util.List;

public class ArrayListExample4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder [] sbArray = {sb1, sb2, sb3, sb4};
        List <StringBuilder> sbList = Arrays.asList(sbArray); //sbList при этом зависим от sbArray, то есть если мы изменим один из элементов sbArray, то это отразится и на sbList
        System.out.println(sbList);
    }
}
