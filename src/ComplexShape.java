import interfaces.Shape;
import java.util.ArrayList; 
import java.util.List;

public class ComplexShape implements Shape { 

    private List<Shape> Shapes;

    public ComplexShape() {
        this.Shapes = new ArrayList<>();
    }

    public void addToShape(Shape shapeToAddToCurrentShape) {
        Shapes.add(shapeToAddToCurrentShape);
    }

    @Override
    public Shape explodeShape() {
        System.out.println("Descomponiendo Forma Compleja en Formas");
        return null; 
    }

    @Override 
    public void renderShapeToScreen() {
        System.out.println("Renderizando Forma Compleja (" + Shapes.size() + " sub-forma):");
        for (Shape shape : Shapes) {
            shape.renderShapeToScreen(); 
        }
        System.out.println("Renderizado de Forma Compleja Terminado.");
    }
}