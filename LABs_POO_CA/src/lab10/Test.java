package lab10;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(Car.CarType.MERCEDES, 20000, 2010);
        Car car2 = new Car(Car.CarType.MERCEDES, 35000, 2015);
        Car car3 = new Car(Car.CarType.FIAT, 3500, 2008);
        Car car4 = new Car(Car.CarType.FIAT, 7000, 2010);
        Car car5 = new Car(Car.CarType.SKODA, 12000, 2015);
        Car car6 = new Car(Car.CarType.SKODA, 25000, 2021);

        Dealership deal = new Dealership();
        System.out.println("Offered price for: " + car1 + " is: " + deal.getFinalPrice(car1));
        System.out.println("Offered price for: " + car2 + " is: " + deal.getFinalPrice(car2));
        System.out.println("Offered price for: " + car3 + " is: " + deal.getFinalPrice(car3));
        System.out.println("Offered price for: " + car4 + " is: " + deal.getFinalPrice(car4));
        System.out.println("Offered price for: " + car5 + " is: " + deal.getFinalPrice(car5));
        System.out.println("Offered price for: " + car6 + " is: " + deal.getFinalPrice(car6));

        Car car7 = new Car(Car.CarType.MERCEDES, 20000, 2019);
        /* Without Lambda
        deal.negotiate(car7, new Offer() {
            @Override
            public int getDiscount(Car car) {
                int discount = (car.getPrice() * 5) / 100;
                System.out.println("Applying Client discount: " + discount + " euros");
                return discount;
            }
        });
        */

        deal.negotiate(car7, car -> {
            int discount = (car.getPrice() * 5) / 100;
            System.out.println("Applying Client discount: " + discount + " euros");
            return discount;
        });

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(Car.CarType.MERCEDES, 30000, 2019));
        cars.add(new Car(Car.CarType.MERCEDES, 50000, 2021));
        cars.add(new Car(Car.CarType.FIAT, 10000, 2018));
        cars.add(new Car(Car.CarType.SKODA, 20000, 2019));

        System.out.println("\nCars before lamba: ");
        cars.forEach(System.out::println);

        cars.removeIf(car -> car.getPrice() > 25000);

        System.out.println("\nCars after lambda:");
        cars.forEach(System.out::println);
    }
}
