package _14Stack;

import java.util.Stack;

public class StackExample2 {

    public static void main(String[] args) {
        Stack <String> names = new Stack<>();

        names.push("Алмаз"); //push кладет ссылку на элемент в коллекцию
        names.push("Миша");
        names.push("Олег");
        names.push("Катя");

//        System.out.println(names.pop()); // pop возвращает верхний элемент коллекции и сразу его удаляет

//        while (!names.isEmpty()) { //пока стэк не пуст, выводи его на экран, возвращай, выводи на экран и удаляй верхний элемент
//            System.out.println(names);
//            System.out.println(names.pop());
//        }
        System.out.println(names.peek()); //peek возвращает верхний элемент стэка, но не удаляет его
        System.out.println(names);
    }
}
