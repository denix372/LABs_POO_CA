package lab10;

public class Car {
    private final CarType carType;
    int price, year;

    public enum CarType {
        MERCEDES, FIAT, SKODA
    }

    public Car(CarType carType, int price, int year) {
        this.carType = carType;
        this.price = price;
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }


    public CarType getCarType() {
        return carType;
    }


    @Override
    public String toString() {
        return "Car{price= " + price + ", carType=" + carType +
                ", year=" + year + "}";
    }
}
