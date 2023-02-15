import java.util.Random;

public class Car {
    //параметры

    String color;

    int number;  //0

    boolean isSuperCar;

    //поведение (методы и функции)

    public Car(String color, int number, boolean isSuperCar) {
        this.color = color;
        this.number = number;
        this.isSuperCar = isSuperCar;
    }

    public Car(String color, boolean isSuperCar) {
        this.color = color;
        this.isSuperCar = isSuperCar;
    }

    public Car() {
        Random random = new Random();
        number = random.nextInt(0, 1000);
    }



    public void go() {
        startEngine();
        if (isSuperCar) {
            System.out.println("Машина с номером " + number + " едет очень быстро");
        }
        else {
            System.out.println("Машина c номером " + number + " едет");
        }
    }

    public void go(int a) {
        System.out.println("Машина едет со скоростью " + a);
    }

    public void startEngine() {
        System.out.println("Двигатель запущен");
    }

    public void info() {
        System.out.println("Это машина имеет цвет: " + color);
        if (isSuperCar) {
            System.out.println("Эта машина быстрая");
        }
        System.out.println("Номер этой машины равен: " + number);
    }

}

