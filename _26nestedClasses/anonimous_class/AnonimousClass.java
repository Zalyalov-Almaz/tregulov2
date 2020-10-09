package _26nestedClasses.anonimous_class;

public class AnonimousClass {

    private int x = 10;

    public static void main(String[] args) {
        Math m = new Math(){ //анонимный класс
            AnonimousClass ac = new AnonimousClass();
            @Override           //представление: какой-то класс без имени имплементирует интерфейс Math и переписывает его метод doOperation
            public int doOperation(int a, int b) { //так же вместо интерфейса можно использовать обычный класс, тогда "какой-то" класс будет наследоваться от класса Math
                return a + ac.x; //  Анонимный класс может обращаться даже к private элементам внешнего класса
            }
        };
        Math m2 = new Math() {  //изменили операцию в классе
            @Override
            public int doOperation(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m2.doOperation(3, 6));

    }
}

interface Math {
    int doOperation(int a, int b);
}
//  Анонимный класс не имеет имени
//  Анонимный класс это одновременное объявление класса и создание его объекта
//  В анаонимных классах нельзя написать конструктор вручную
//  Анонимный класс может обращаться даже к private элементам внешнего класса
//  Лямбда выражения - это краткая форма для написания анонимных классов
//  Анонимных интерфейсов не существует