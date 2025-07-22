package lab3;

public class Main {
    public static void main(String[] args) {
        Form[] arr = new Form[3];
        arr[0] = new Triangle(4, 5, "green");
        arr[1] = new Circle(3.2f, "red");
        arr[2] = new Square(6.0f, "blue");

        for(Form f : arr){
            System.out.println(f.toString());
        }

        for(Form f : arr){
            if( f instanceof Triangle)
                ((Triangle) f).printTriangleDimensions();
            else if(f instanceof Square)
                    ((Square) f).printSquareDimensions();
            else if(f instanceof Circle)
                    ((Circle) f).printCircleDimensions();
        }

        for(Form f : arr){
            f.printDimension();
        }

        for(Form f : arr){
            f.printPerimeter();
        }

    }
}
