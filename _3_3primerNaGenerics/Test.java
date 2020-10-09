package _3_3primerNaGenerics;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Газиз", 13);
        Schoolar schoolar2 = new Schoolar("Ильназ", 16);
        Schoolar schoolar3 = new Schoolar("Булат", 16);
        Schoolar schoolar4 = new Schoolar("Ильнар", 16);

        Student student1 = new Student("Зохрэ", 20);
        Student student2 = new Student("Рината", 20);

        Employee employee1 = new Employee("Роберт", 28);
        Employee employee2 = new Employee("Алмаз", 31);

        Team<Schoolar> schoolars = new Team<>("Школьники");
        Team<Schoolar> schoolars2 = new Team<>("Школьники2");
        Team<Student> students = new Team<>("Студенты");
        Team<Employee> emps = new Team<>("Взрозлые");

        schoolars.addNewParticipant(schoolar1);
        schoolars.addNewParticipant(schoolar2);
        schoolars2.addNewParticipant(schoolar3);
        schoolars2.addNewParticipant(schoolar4);
        students.addNewParticipant(student1);
        students.addNewParticipant(student2);
        emps.addNewParticipant(employee1);
        emps.addNewParticipant(employee2);

        System.out.println("Взрослые играют со школьниками");
        schoolars.playWith(schoolars2);
    }
}
//Здесь все было сделано правильно, но если посмотреть то можно понять, что в эти команды можно было добавлять любой объект который является Participant, то есть к школьникам можно было добавить
//взрослого, к студентам школьника итд. Напишем в классе Team generics, тогда при создании тут объекта Team, мы указываем <T> <T - это Schoolar или Student, или Employee>.
//Тогда в команду можно будет добавить только объекты, которые написаны вунтри <>. Но это еще не конец, потому что в итоге можно создать команду String'ов или любых других объектов,
//это тоже не корректно. Чтобы запретить программе выполнять подобный код, в объявлении класса Team напишем <T extends Participant> и тогда в команды можно будет добавлять только объекты
//имеющие связь is a с классом Participant. Теперь у нас есть еще одна проблема, ведь команда школьников может играть с работниками или студентами итд. Чтобы это исключить в классе Team
//в методе playWith в параметре напишем (Team <T> team) и тогда школьники смогут играть только со школьниками, студенты со студентами и тд.