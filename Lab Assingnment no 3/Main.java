public class Main {
    public static void main(String[] args) {
        Shape shape;
        Shape2D shape2d;
        Shape3D shape3d;

        Rectangle rectangle = new Rectangle(7.0, 6.0);
        System.out.println("Rectangle width: " + rectangle.getWidth());
        System.out.println("Rectangle length: " + rectangle.getLength());
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        Circle circle = new Circle(5.0);
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + circle.area());

        Sphere sphere = new Sphere(4.0);
        System.out.println("Sphere radius: " + sphere.getRadius());
        System.out.println("Sphere surface area: " + sphere.area());
        System.out.println("Sphere volume: " + sphere.volume());

        Cube cube = new Cube(3.0);
        System.out.println("Cube side: " + cube.getSide());
        System.out.println("Cube surface area: " + cube.area());
        System.out.println("Cube volume: " + cube.volume());

        Shape[] shapes = new Shape[20];
        shapes[0] = new Circle(3.0);
        shapes[1] = new Circle(7.3);
        shapes[2] = new Rectangle(2.3, 9.7);
        shapes[3] = new Rectangle(4.3, 7.4);
        shapes[4] = new Cube(4.0);
        shapes[5] = new Cube(2.4);
        shapes[6] = new Sphere(4.3);
        shapes[7] = new Sphere(5.6);
        shapes[8] = new Circle(8.4);
        shapes[9] = new Rectangle(4.4, 7.6);
        shapes[10] = new Cube(3.5);
        shapes[11] = new Sphere(2.3);
        shapes[12] = new Circle(8.4);
        shapes[13] = new Rectangle(4.5, 5.4);
        shapes[14] = new Cube(7.6);
        shapes[15] = new Sphere(4.6);
        shapes[16] = new Circle(4.0);
        shapes[17] = new Rectangle(2.3, 6.7);
        shapes[18] = new Cube(4.4);
        shapes[19] = new Sphere(3.4);

        System.out.println("\n- Displaying Shapes ");
        ShapeUtils.displayShapes(shapes);

        Rectangle checkRectangle = new Rectangle(4.3, 7.4);
        boolean intersects = ShapeUtils.isIntersect(shapes, checkRectangle);
        System.out.println("Does it intersect with a matching rectangle " + intersects);
    }
}
