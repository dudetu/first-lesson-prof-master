import java.util.Scanner;

public class MainForPerson {

    public static void main(String[] args) {
        //Person person = new Person("Даниил");
        //person.age = 21;
        //person.daysAfterBirthday = 256;
        //System.out.println(person.daysAfterBirthday);
//
        //person.getDaysOld();
//
//
//
//
//
        //Person secondPerson = new Person("Андрей");
//
        //Person.president = "Билл Клинтон";
        //Person.president = "Джорж Буш";
//
        //System.out.println(person.name);
//
        ////не-статик поля вызываются через объект
        ////статик поля вызываются через Класс
//
//
        //System.out.println(person.name);
        //System.out.println(secondPerson.name);
//
        //System.out.println(person.president);
        //System.out.println(secondPerson.president);
//
        //Person thirdPerson = new Person("Павел");
//
        //System.out.println(thirdPerson.president);
//
//
        //thirdPerson.info();
        //secondPerson.info();
        //person.info();
//
        //Person.infoAboutClass();
//
        //int a = Math.min(4, 5);


        Person person = new Person("Даниил");
        person.setPassword("qwerty123");


        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        person.login(password);






    }
}
