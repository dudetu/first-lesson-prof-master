import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = 10;
        Car c = null;
        //System.out.println(c);

        Car car = new Car("blue", 543, true);

        Car car1 = new Car("yellow", true);
        System.out.println(car1.number);


        car.go();
        car.go(50);


        Car secondCar = new Car("green", 12, false);

        System.out.println(car);
        System.out.println(secondCar);

        System.out.println(car.color);
        System.out.println(secondCar.color);

        System.out.println(car.number);
        System.out.println(secondCar.number);

        System.out.println("-------------------");

        Car thirdCar = new Car("yellow", 1, false);

        System.out.println(thirdCar);
        System.out.println(thirdCar.number);
        System.out.println(thirdCar.color);
        System.out.println(thirdCar.isSuperCar);

        car.go();
        secondCar.go();
        thirdCar.go();

        car.info();
        System.out.println();
        secondCar.info();
        System.out.println();
        thirdCar.info();

    }
}