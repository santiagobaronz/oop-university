// A package declaration.
package poo_clasesabstractas.ejercicio1;

/**
 * Cuadrado extends Figura, and it overrides the methods calcularArea and getTypeOfFigure.
 */
public class Cuadrado extends Figura{
    private double lado = 0;
    private String type;

    public Cuadrado(double x, double y, double z) {
        super(x, y);
        this.lado = z;
        this.type = "Cuadrado";
    }
    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }

    @Override
    public String getTypeOfFigure() {
        return this.type;
    }
    
}
