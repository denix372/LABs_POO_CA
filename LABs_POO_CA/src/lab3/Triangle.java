package lab3;

public class Triangle extends Form {
    float height, base;

    public Triangle(){
        super();
        height = 0;
        base = 0;
    }
    public Triangle(float height, float base, String color){
        this.height = height;
        this.base = base;
        this.setColor(color);
    }

    @Override
    public float getArea(){
        return (base * height)/2;
    }

    @Override
    public String toString() {
        return super.toString() + ". It's a triangle with base " + base + " and height " + height ;
    }

    //task3 <- generare automata
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(height, triangle.height) == 0 && Float.compare(base, triangle.base) == 0;
    }

    public void printTriangleDimensions(){
        System.out.println("The triangle has the base " + base + " and the height " + height);
    }

    @Override
    public void printDimension(){
        System.out.println("The triangle has the base " + base + " and the height " + height);
    }

    @Override
    public void printPerimeter(){
        float nr = base + 2 + (float)Math.sqrt( (base/2)*(base/2) + height*height);
        System.out.println("The triangle has perimeter " + nr);
    }

}
