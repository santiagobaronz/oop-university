/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_clasesabstractas.ejercicio1;

/**
 *
 * @author nixod
 */
public class Cuadrado extends Figura{
    private double lado = 0;

    public Cuadrado(double x, double y, double z) {
        super(x, y);
        this.lado = z;
    }
    
    @Override
    public double calcularArea() {
        return this.lado * this.lado;
    }
    
}
