package clases;

public abstract class Figura {
    private Punto centro = new Punto();
    
    public Figura (double x, double y){
        centro.setCoordenadaX(x);
        centro.setCoordenadaY(y);
    }
    
    public abstract double calcularArea();
    public abstract String getTypeOfFigure();
}
