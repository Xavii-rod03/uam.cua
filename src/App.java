import interfaces.Shape;
import java.util.List;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
       
        GraphicsEditor editor = new GraphicsEditor();
        List<Shape> shapes = new ArrayList<>();

        Line line1 = new Line();
        Rectangle rectangle1 = new Rectangle();

        shapes.add(line1);
        shapes.add(rectangle1);

        editor.renderGraphics(shapes);
        


    }
}
