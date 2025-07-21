package lab2.task3;

public class Point {
    float x,y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public Point(Point p){
        this.x = p.x ;
        this.y = p.y ;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    void changeCoords(float x, float y ){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
