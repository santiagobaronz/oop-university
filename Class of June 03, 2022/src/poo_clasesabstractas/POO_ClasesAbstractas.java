/**
 * This class is the main class of the program, it contains the main method and it's the one that calls
 * the other classes
 */

// It's importing the classes that are going to be used in the program.
package poo_clasesabstractas;

import java.util.ArrayList;
import java.util.Scanner;

import poo_clasesabstractas.ejercicio1.Circulo;
import poo_clasesabstractas.ejercicio1.Cuadrado;
import poo_clasesabstractas.ejercicio1.Figura;

public class POO_ClasesAbstractas {

    public static void main(String[] args) {

        // It's declaring the variables that are going to be used in the program.

        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();
        int nfiguras = 0;
        double area = 0;
        int contador = 0;
        String tipo;

        System.out.println("------------------------------------------------------");

        // It's asking the user to input the number of figures that he wants to create.

        System.out.print("Ingrese el número de figuras: ");
        Scanner sc = new Scanner(System.in);
        nfiguras = sc.nextInt();

        
        while(contador < nfiguras){

            System.out.println("¿Ingrese el numero que corresponda según lo que necesite: ");
            System.out.println("1). Cuadrado ");
            System.out.println("2). Circulo");
            System.out.print("Respuesta: ");
            Scanner respuesta = new Scanner(System.in);
            int respuestaFigura = respuesta.nextInt();

            switch (respuestaFigura) {
                case 1:
                System.out.println(" ---> Ingrese los siguientes datos para el cuadrado:");

                    System.out.print(" ---> Coordenada en x: ");
                    Scanner coordx = new Scanner(System.in);
                    int coordenadaX = coordx.nextInt();

                    System.out.print(" ---> Coordenada en y: ");
                    Scanner coordy = new Scanner(System.in);
                    int coordenadaY = coordy.nextInt();

                    System.out.print(" ---> Lado del cuadrado: ");
                    Scanner lado = new Scanner(System.in);
                    int ladoCuadrado = lado.nextInt();

                    Figura figura1 = new Cuadrado(coordenadaX, coordenadaY, ladoCuadrado);
                    listaFiguras.add(figura1);

                    contador++;

                    break;

                case 2:
                System.out.println(" ---> Ingrese los siguientes datos para el circulo:");
                    System.out.print(" ---> Coordenada en x: ");
                    Scanner c_coordx = new Scanner(System.in);
                    int c_coordenadaX = c_coordx.nextInt();

                    System.out.print(" ---> Coordenada en y: ");
                    Scanner c_coordy = new Scanner(System.in);
                    int c_coordenadaY = c_coordy.nextInt();

                    System.out.print(" ---> Radio del circulo: ");
                    Scanner c_lado = new Scanner(System.in);
                    int c_ladoCuadrado = c_lado.nextInt();

                    Figura figura2 = new Circulo(c_coordenadaX, c_coordenadaY,c_ladoCuadrado);
                    listaFiguras.add(figura2);

                    contador++;

                    break;

                default:

                System.out.println(" Debe ingresar un valor valido entre 1 y 2 ");

                    break;
            }
        }

        System.out.println("------------------------------------------------------");

        // It's printing the area of each figure.
        
        for(int i = 0; i < listaFiguras.size(); i++){
            area = listaFiguras.get(i).calcularArea();
            tipo = listaFiguras.get(i).getTypeOfFigure();
            System.out.println("Area del "+ tipo +": " + area);
        }

        System.out.println("No. de figuras: " + nfiguras);
        System.out.println("------------------------------------------------------");

    }
    
}
