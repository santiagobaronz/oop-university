// A package declaration.
package poo_clasesabstractas.ejercicio1;

/**
 * Figura is an abstract class that has a Punto object as an attribute and two abstract methods.
 */

public abstract class Figura {
    private Punto centro = new Punto();
    
    public Figura (double x, double y){
        centro.setCoordenadaX(x);
        centro.setCoordenadaY(y);
    }
    
    public abstract double calcularArea();
    public abstract String getTypeOfFigure();
}
