package lab3;

public class Form {
    private String color;

    public Form(){
        color = "white";
    }

    public Form(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "This form has the color " + color;
    }

    public void printDimension(){
        System.out.println("No dimension");
    }

    public void printPerimeter(){
        System.out.println("No perimeter");
    }

}
