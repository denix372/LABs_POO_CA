package lab2.task3;

public class Main {
    public static void main(String[] args) {
        float[] coords = {
                1.5f, 2.0f,
                3.0f, 4.2f,
                -1.0f, 0.5f
        };

        Polygon poly = new Polygon(coords);
        poly.showPolygon();

    }
}
