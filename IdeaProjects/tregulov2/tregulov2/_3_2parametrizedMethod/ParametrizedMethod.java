package _3_2parametrizedMethod;

import java.util.ArrayList;

public class ParametrizedMethod {

    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(2);
        al1.add(3);
        int a = GenMethod.getSecondElement(al1);
        System.out.println(a);
        ArrayList <String> al2 = new ArrayList<>();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        String s = GenMethod.getSecondElement(al2);
        System.out.println(s);
    }

}

class GenMethod {

    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
