import interfaces.Shape;
import java.util.ArrayList;
import java.util.List; 

public class GraphicsEditor {

    private List<Shape> Shapes = new ArrayList<>();

    public void renderGraphics(List<Shape> shapesToRender) {
        System.out.println("\n--- Iniciando Ciclo de Renderizado Gráfico ---"); // Traducido
        if (shapesToRender.isEmpty()) {
            System.out.println("El Lienzo está vacío. Nada para renderizar."); // Traducido
            return;
        }

        for (Shape shape : shapesToRender) {
            shape.renderShapeToScreen();
        }
        System.out.println("--- Ciclo de Renderizado Gráfico Finalizado ---\n"); // Traducido
    }

    public void addShape(Shape shape) {
        this.Shapes.add(shape);
        System.out.println("Forma añadida al lienzo."); // Traducido
    }
}