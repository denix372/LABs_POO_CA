package lab3;

public class Circle extends Form {
    float radius;

    public Circle(){
        super();
        radius = 0;
    }

    public Circle(float radius, String color){
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public float getArea(){
        return (float)Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ". It's a circle with radius " + radius ;
    }

    public void printCircleDimensions(){
        System.out.println("The circle has the radius " + radius);
    }

    @Override
    public void printDimension(){
        System.out.println("The circle has the radius " + radius);
    }

    @Override
    public void printPerimeter(){
        System.out.println("The circle has perimeter " + 2 * (float)Math.PI * radius);
    }
}
