public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }
 public double getRadius() {
        return radius;
    }
    @Override
    public double area() {
        return 4 * 3.14 * radius * radius;
    }
    @Override
    public double volume() {
        return (4.0 / 3.0) * 3.1416 * radius * radius * radius;
    }
    @Override
    public String toString() {
        return "Sphere Area: " + area() + "\n" +
               "Sphere Volume: " + volume();
    }
}
