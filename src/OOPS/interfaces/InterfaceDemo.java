package OOPS.interfaces;

public class InterfaceDemo {
    static void main(String[] args) {
//        electricCar e1 = new electricCar();
//        e1.applyBreaks();
//        e1.turnLeft();

        CarControls myCar1 = new electricCar();
        myCar1.turnLeft();

        CarControls  myCar2 = new SportsCar();
        myCar2.turnLeft();
    }
}
