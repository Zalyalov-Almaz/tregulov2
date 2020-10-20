package _26nestedClasses.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math m = new Math();
        m.getResult();
    }
}

class Math {

    private int a = 12;

    public void getResult() {
        class Division {                //локальный класс виден только внутри блока кода, где он написан (метод, конструктор, инициализатор)
            private int dividend;       //локальный иннер класс не может быть статическим
            private int divider;        //локальный иннер класс может обращаться даже к private элементам своего аутер класса

            public int getDividend() {
                return dividend;
            }

            public void setDividend(int dividend) {
                this.dividend = dividend;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }
            public int getQuotient() {
                return dividend/divider;
            }
            public int getRemainder() {
                System.out.println(a); //локальный иннер класс может обращаться даже к private элементам своего аутер класса
                return dividend%divider;
            }
        }
        Division d = new Division();
        d.setDividend(21);
        d.setDivider(4);
        System.out.println("Делимое = " + d.getDividend());
        System.out.println("Делитель = " + d.getDivider());
        System.out.println("Частное = " + d.getQuotient());
        System.out.println("Остаток = " + d.getRemainder());
    }
}
// Локальные иннер классы пишутся в блоках кода