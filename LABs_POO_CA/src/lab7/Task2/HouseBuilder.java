package lab7.Task2;

public class HouseBuilder {
    String location;
    int floors, rooms;

    boolean appliances = false;
    boolean pool = false;
    boolean solarPanels = false;
    boolean security = false;

    public HouseBuilder(String location, int floors, int rooms) {
        this.location = location;
        this.floors = floors;
        this.rooms = rooms;
    }

    public HouseBuilder withAppliances() {
        this.appliances = true;
        return this;
    }

    public HouseBuilder withPool() {
        this.pool = true;
        return this;
    }

    public HouseBuilder withSolarPanels() {
        this.solarPanels = true;
        return this;
    }

    public HouseBuilder withSecurity() {
        this.security = true;
        return this;
    }

    public House build() {
        return new House(this);
    }

}
