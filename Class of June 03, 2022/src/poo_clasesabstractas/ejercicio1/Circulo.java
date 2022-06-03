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
public class Circulo extends Figura{

    private double radio = 0;

    public Circulo(double x, double y, double z) {
        super(x, y);
        this.radio = z;
    }
    
    @Override
    public double calcularArea() {
        return (3.1416 * (this.radio * this.radio));
    }
    
}
