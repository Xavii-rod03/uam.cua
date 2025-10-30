import interfaces.Shape;

// Antes: public class Line {
public class Line implements Shape {

   @Override // Es buena práctica usar @Override
   public Shape explodeShape() {
       System.out.println("\"Descomponiendo Línea en Puntos\"");
       return null;
   }
   
   @Override
   public void renderShapeToScreen() {
       System.out.println("Renderizando Línea en Pantalla");
   }
}