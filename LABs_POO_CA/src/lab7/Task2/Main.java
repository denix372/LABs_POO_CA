package lab7.Task2;

public class Main {
    public static void main(String[] args) {
        House house = new HouseBuilder("Bucuresti", 2, 5)
                .withAppliances()
                .withSecurity()
                .build();

        System.out.println(house);
    }
}
