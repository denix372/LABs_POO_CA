package lab7.Task2;

public class House {
    private String location;
    private int floors, rooms;

    private boolean appliances, pool, solarPanels, security;

    public House (HouseBuilder builder) {
        this.location = builder.location;
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.appliances = builder.appliances;
        this.pool = builder.pool;
        this.solarPanels = builder.solarPanels;
        this.security = builder.security;
    }

    @Override
    public String toString() {
        return "House built in " + location + " with " + floors + " floors and "
                + rooms + " rooms.\n" +
                "Appliances: " + appliances + "\n" +
                "Pool: " + pool + "\n" +
                "Solar Panels: " + solarPanels + "\n" +
                "Security System: " + security;
    }
}
