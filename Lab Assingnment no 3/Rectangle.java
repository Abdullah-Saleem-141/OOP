public class Rectangle extends Shape2D {
    private double length;
    private double width;
    private boolean isfilled;
    private Point topLeftCorner;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
        this.isfilled = false;
        this.topLeftCorner = new Point(0, 0);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public boolean isFilled() {
        return isfilled;
    }
    @Override
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }

public Point getTopLeftCorner() {
        return topLeftCorner;
    }
    public void setTopLeftCorner(Point p) {
        this.topLeftCorner = p;
    }
    @Override
    public String toString() {
        return "Rectangle Area: " + area() + "\n" +
               "Rectangle Perimeter: " + perimeter() ;
}
}