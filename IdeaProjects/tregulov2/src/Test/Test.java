package Test;

import java.util.*;

public class Test {

    private String name;
    private int diametr;

    public Test(String name, int diametr) {
        this.name = name;
        this.diametr = diametr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", diametr=" + diametr +
                '}';
    }
}
class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        Queue<String> queue = new LinkedList<String>();

        stack.push("Apple");
        stack.push("Bannana");
        stack.push("Cherry");
        queue.add(stack.pop());
        stack.push("Dingleberry");
        stack.push("Eggplant");
        stack.push("Figg");
        stack.push(queue.remove());
        queue.add(stack.pop());
        queue.add(stack.pop());

        System.out.println(stack);
        System.out.println(queue);


    }
}