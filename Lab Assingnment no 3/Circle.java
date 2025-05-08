public class Circle extends Shape2D {
    private double radius;
    private boolean isfilled;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
        this.isfilled = false;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
@Override
    public double area() {
        return 3.1416 * radius * radius;
    }
    @Override
    public String toString() {
        return "Circle Area: " +   area() ;
    }

    @Override
    public boolean isFilled() {
        return isfilled;
    }
}
