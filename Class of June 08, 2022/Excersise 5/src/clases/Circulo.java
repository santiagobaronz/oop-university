package clases;

// A package declaration.

/**
 * Circulo extends Figura and implements the abstract methods of Figura.
 */

public class Circulo extends Figura{

    private double radio = 0;
    private String type;

    public Circulo(double x, double y, double z) {
        super(x, y);
        this.radio = z;
        this.type = "Circulo";
    }
    
    @Override
    public double calcularArea() {
        return (3.1416 * (this.radio * this.radio));
    }

    @Override
    public String getTypeOfFigure() {
        return this.type;
    }
    
}
