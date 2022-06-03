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
public abstract class Figura {
    private Punto centro = new Punto();
    
    public Figura (double x, double y){
        centro.setCoordenadaX(x);
        centro.setCoordenadaY(y);
    }
    
    public abstract double calcularArea();
}
