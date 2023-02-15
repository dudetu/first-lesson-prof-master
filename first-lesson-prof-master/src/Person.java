public class Person {
    private String name;

    private int age;

    private static String president;

    private int daysAfterBirthday;

    private String password;

    public Person(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void login(String currentPassword) {
        if (currentPassword.equals(password)) {
            System.out.println("Успешно");
        }
        else {
            System.out.println("Неверный пароль");
        }
    }

    //Все поля PRIVATE
    //Все те методы, которые изначально не планировалось давать пользователю - PRIVATE

    public void getDaysOld() {
        int days = calculateDaysOld();

        System.out.println(name + " прожил " + days + " дней");
    }

    private int calculateDaysOld() {
        int days = age * 365;
        int additionalDays = age / 4;
        days += additionalDays;
        days += daysAfterBirthday;
        return days;
    }




    public void info() {
        System.out.println("Меня зовут " + name);
        System.out.println("Мой президент " + president);
    }

    public static void infoAboutClass() {
        System.out.println("Мой президент " + president);
    }

    //В стат. методе нельзя использовать не-стат. переменные, потому что нет контекста
    //В стат. методе МОЖНО использовать стат. переменные

    //В не-стат. методе МОЖНО использовать не-стат. переменные
    //В не-стат. методе МОЖНО использовать стат. переменные

    //метод-утилита


}
