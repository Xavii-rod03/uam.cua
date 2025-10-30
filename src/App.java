import interfaces.Shape;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        GraphicsEditor editor = new GraphicsEditor();
        List<Shape> shapes = new ArrayList<>();

        // Estas clases ya son reconocidas como Shape
        Line line1 = new Line(); 
        Rectangle rectangle1 = new Rectangle();

        // El compilador ya no reporta error aquí
        shapes.add(line1); 
        shapes.add(rectangle1);

        editor.renderGraphics(shapes);
        


    }
}