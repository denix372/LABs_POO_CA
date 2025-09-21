package lab10;

import java.util.Random;

public class Dealership {
    private static class BrandOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            if( car.getCarType() == Car.CarType.MERCEDES) {
                System.out.println("Applying " + car.getCarType() + " discount: " + (5 * car.getPrice()) / 100 + " euros");
                return (5 * car.getPrice()) / 100;
            } else if(car.getCarType() == Car.CarType.FIAT) {
                System.out.println("Applying " + car.getCarType() + " discount: " + (10 * car.getPrice()) / 100 + " euros");
                return (10 * car.getPrice()) / 100;
            } else {
                System.out.println("Applying " + car.getCarType() + " discount: " + (15 * car.getPrice()) / 100 + " euros");
                return (15 * car.getPrice()) / 100;
            }
        }
    }

    private static class DealerOffer implements Offer {
        @Override
        public int getDiscount(Car car) {
            if( car.getCarType() == Car.CarType.MERCEDES) {
                System.out.println("Applying " + car.getCarType() + " discount: " + 300 * (2025 - car.getYear()) + " euros");
                return 300 * (2025 - car.getYear());
            } else if(car.getCarType() == Car.CarType.FIAT) {
                System.out.println("Applying " + car.getCarType() + " discount: " + 100 * (2025 - car.getYear()) + " euros");
                return 100 * (2025 - car.getYear());
            } else {
                System.out.println("Applying " + car.getCarType() + " discount: " + 150 * (2025 - car.getYear()) + " euros");
                return 150 * (2025 - car.getYear());
            }
        }
    }

    private static class SpecialOffer implements Offer {
        private final int discount;
        private static final Random random = new Random(20);

        public SpecialOffer(){
            this.discount = random.nextInt(1000);
        }

        @Override
        public int getDiscount(Car car) {
            System.out.println("Applying " + car.getCarType() + " discount: " + discount + " euros");
            return discount;
        }
    }

    public int getFinalPrice(Car car) {
        Offer brand = new BrandOffer();
        Offer dealer = new DealerOffer();
        Offer special = new SpecialOffer();

        int discount = brand.getDiscount(car) + dealer.getDiscount(car)
                + special.getDiscount(car);
        return car.getPrice() - discount;
    }

    public void negotiate(Car car, Offer offer) {
        int discount = offer.getDiscount(car);
        System.out.println("Negotiated for " + car.getCarType() + " discount " + discount + " euros");
    }
}
