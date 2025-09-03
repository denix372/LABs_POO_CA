package lab6;

public class TextVisitor implements Visitor{
    @Override
    public void visit(Dot dot) {
        System.out.println("Dot - x = " + dot.getX() + ", y = " + dot.getY());
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("Circle - radius = " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Rectangle - length = " + rectangle.getLength() +
                ", width = " + rectangle.getWidth());
    }
}
