import interfaces.Shape;

// Antes: public class Rectangle {
public class Rectangle implements Shape { 

    private Shape rectanEdges;

    @Override
    public Shape explodeShape() {
        System.out.println("\"Descomponiendo Rectángulo\"");
        return rectanEdges;
    }
    
    @Override
    public void renderShapeToScreen() {
        System.out.println("Renderizando Rectángulo en Pantalla");
    }
}