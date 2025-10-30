import interfaces.Shape;
import java.util.ArrayList; // Necesaria para la inicialización
import java.util.List;

// ¡IMPORTANTE! El ComplexShape debe implementar Shape
public class ComplexShape implements Shape { 

    private List<Shape> Shapes;

    // Constructor para inicializar la lista y evitar NullPointerException
    public ComplexShape() {
        this.Shapes= new ArrayList<>();
    }

    public void addToShape(Shape shapeToAddToCurrentShape) {
        Shapes.add(shapeToAddToCurrentShape);
    }

    public Shape explodeShape() {
        System.out.println("Exploding Complex Shape into Shapes");
        // En una implementación real, podría devolver shapeList o una copia.
        return null; 
    }

    // SOBREESCRIBE el método de la interfaz Shape
    @Override 
    public void renderShapeToScreen() {
        System.out.println("Rendering Complex Shape (" + Shapes.size() + " sub-shapes):");
        // El Compuesto DELEGA la operación a sus hijos
        for (Shape shape : Shapes) {
            shape.renderShapeToScreen(); 
        }
        System.out.println("Finished rendering Complex Shape.");
    }
}