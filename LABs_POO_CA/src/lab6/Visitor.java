package lab6;

public interface Visitor {
    void visit(Dot dot);
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
