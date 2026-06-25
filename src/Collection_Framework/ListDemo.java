package Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Car{
    String brand;

    public Car(String brand){
        this.brand = brand;
    }
}

public class ListDemo {
    static void main(String[] args) {
        List <String> users = new ArrayList();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("Alice");

        System.out.println("All users");
        for (Object user : users) {
            System.out.println(user);
        }

        System.out.println("Elements using index: "+users.get(1));

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Ford");

        List <Car> CarList = new ArrayList<>();
        CarList.add(car1);
        CarList.add(car2);

        System.out.println("All cars");
        for (Car car : CarList) {
            System.out.println(car.brand);
        }
    }
}
