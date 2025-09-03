package lab6;

public class JsonVisitor implements Visitor {

    @Override
    public void visit(Dot dot) {
        System.out.println("{\n" +
                "  \"Dot\": {\n" +
                "    \"x\": " + dot.getX() + ",\n" +
                "    \"y\": " + dot.getY() + "\n" +
                "  }\n" +
                "}");
    }

    @Override
    public void visit(Circle circle) {
        System.out.println("{\n" +
                "  \"Circle\": {\n" +
                "    \"radius\": " + circle.getRadius() + "\n" +
                "  }\n" +
                "}");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("{\n" +
                "  \"Rectangle\": {\n" +
                "    \"length\": " + rectangle.getLength() + ",\n" +
                "    \"width\": " + rectangle.getWidth() + "\n" +
                "  }\n" +
                "}");
    }
}
