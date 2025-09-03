package lab6;

public class Main {
    public static void main(String[] args) {
        Shape dot = new Dot(5, 10);
        Shape circle = new Circle(30);
        Shape rectangle = new Rectangle(20, 40);

        Visitor textVisitor = new TextVisitor();
        Visitor jsonVisitor = new JsonVisitor();

        // Afisare in format text
        dot.accept(textVisitor);
        circle.accept(textVisitor);
        rectangle.accept(textVisitor);

        System.out.println();

        // Afisare in format JSON
        dot.accept(jsonVisitor);
        circle.accept(jsonVisitor);
        rectangle.accept(jsonVisitor);
    }
}
