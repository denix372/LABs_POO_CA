package lab2.task3;

public class Polygon {
    private Point[] points;

    public Polygon(int n){
        points = new Point[n];
    }

    public Polygon(float[] nr){
        this(nr.length / 2);

        for(int i = 0; i < nr.length; i = i + 2) {
            points[i / 2] = new Point(nr[i], nr[i + 1]);

        }
    }

    public void showPolygon() {
        for (Point p : points) {
            System.out.println(p);
        }
    }
}
