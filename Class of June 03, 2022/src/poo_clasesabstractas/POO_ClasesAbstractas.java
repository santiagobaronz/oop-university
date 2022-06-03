/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_clasesabstractas;

import java.util.ArrayList;
import java.util.Scanner;

import poo_clasesabstractas.ejercicio1.Circulo;
import poo_clasesabstractas.ejercicio1.Cuadrado;
import poo_clasesabstractas.ejercicio1.Figura;

/**
 *
 * @author nixod
 */
public class POO_ClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
        int nfiguras = 0;
        double area = 0;


        System.out.print("Ingrese el número de figuras: ");
        Scanner sc = new Scanner(System.in);
        nfiguras = sc.nextInt();
        
        Figura figura1 = new Cuadrado(3, 6,8);
        Figura figura2 = new Circulo(4, 7,2);
        listaFiguras.add(figura1);
        listaFiguras.add(figura2);

        for(int i = 0; i < listaFiguras.size(); i++){
            area = listaFiguras.get(i).calcularArea();
            System.out.println("Area: " + area);
        }


        System.out.println("No. de figuras: " + nfiguras);
    }
    
}
