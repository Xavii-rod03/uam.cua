import interfaces.Shape;
import java.util.ArrayList;
import java.util.List; // Necesario para inicializar la lista en main()

public class GraphicsEditor {

    // Lista para mantener un registro de todas las formas en el lienzo
    private List<Shape> Shapes = new ArrayList<>();

    public void renderGraphics(List<Shape> shapesToRender) {
        System.out.println("\n--- Starting Graphic Rendering Cycle ---");
        if (shapesToRender.isEmpty()) {
            System.out.println("Canvas is empty. Nothing to render.");
            return;
        }

        // Iterar sobre la lista y delegar la tarea de dibujado a cada objeto Shape
        for (Shape shape : shapesToRender) {
            shape.renderShapeToScreen();
        }
        System.out.println("--- Graphic Rendering Cycle Finished ---\n");
    }

    // Método auxiliar para la gestión de formas (opcional, pero útil)
    public void addShape(Shape shape) {
        this.Shapes.add(shape);
        System.out.println("Shape added to canvas.");
    }
}