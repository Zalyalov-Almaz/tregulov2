package _27lambda;

public class StudentInfo3 {

    static void def(I i) {
        System.out.println(i.abc("Привет"));
    }

    public static void main(String[] args) {
        def((String s) -> {return s.length();}); //полное написание, ниже короткое написание
//        def(() -> 5); // если в интерфейсе метод не принимает параметров, то слева от -> вы должны писать ()
        def((String s) -> 5);
    }
}

interface I {
    int abc(String s);
}
//метод def принимает в параметр объект класса, имплементирующего I, и выводит на экран результат абстрактного метода abc из этого интерфейса
//в методе main пишем лямбда выражение, где в фигурных скобках тело метода abc