package lab3;


public class Square extends Form {
    float side;

    public Square(){
        super();
        side = 0;
    }

    public Square(float side, String color){
        this.side = side;
        this.setColor(color);
    }

    @Override
    public float getArea(){
        return (float)Math.pow(side,2);
    }

    @Override
    public String toString() {
        return super.toString() + ". It's a square with side " + side ;
    }

    public void printSquareDimensions(){
        System.out.println("The square has the side " + side);
    }

    @Override
    public void printDimension(){
        System.out.println("The square has the side " + side);
    }

    @Override
    public void printPerimeter(){
        System.out.println("The square has perimeter " + 4 * side);
    }
}
