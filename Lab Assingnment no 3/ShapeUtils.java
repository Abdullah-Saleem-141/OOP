public class ShapeUtils {

   public static void displayShapes(Shape[] shapes) {
        for(int i=0;i<shapes.length;i++){
            System.out.println(shapes[i].toString());
            
        }
    }

    public static void drawDrawables(Drawable[] drawables) {
 for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] != null) {
                drawables[i].draw();
    }
        }
    }

    public static boolean isIntersect(Shape[] shape, Rectangle otherrectangle) {
for (Shape s : shape) {
    if (s instanceof Rectangle) {
 Rectangle r = (Rectangle) s;
        if (r.getLength() == otherrectangle.getLength() && r.getWidth() == otherrectangle.getWidth()) {
     return true;
                }
            }
        }
        return false;
    }
}
