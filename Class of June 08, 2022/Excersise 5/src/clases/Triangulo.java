// A package declaration.
package clases;

/**
 * Cuadrado extends Figura, and it overrides the methods calcularArea and getTypeOfFigure.
 */
public class Triangulo extends Figura{
    private double lado = 0;
    private String type;

    public Triangulo(double x, double y, double z) {
        super(x, y);
        this.lado = z;
        this.type = "Triangulo";
    }
    
    @Override
    public double calcularArea() {
        return (this.lado * this.lado)/2;
    }

    @Override
    public String getTypeOfFigure() {
        return this.type;
    }
    
}
