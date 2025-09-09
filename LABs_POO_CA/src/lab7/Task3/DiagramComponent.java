package lab7.Task3;

public class DiagramComponent {
    private int width =100, height = 100;
    private String color = "black", text= "";

    public void resize(double percent) {
        width *= percent;
        height *= percent;
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public void changeText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Component[" + width + "x" + height + ", color=" + color
                + ", text= " + text + "]";
    }

    public String getColor() {
        return color;
    }

    public String getText() {
        return text;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
