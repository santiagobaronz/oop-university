import java.util.ArrayList;
import java.util.Scanner;

import clases.Circulo;
import clases.Cuadrado;
import clases.Figura;

public class App {
    public static void main(String[] args) throws Exception {
        
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
            System.out.println("3). Triangulo");
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

                case 2:
                System.out.println(" ---> Ingrese los siguientes datos para el circulo:");
                    System.out.print(" ---> Coordenada en x: ");
                    Scanner t_coordx = new Scanner(System.in);
                    int t_coordenadaX = t_coordx.nextInt();

                    System.out.print(" ---> Coordenada en y: ");
                    Scanner t_coordy = new Scanner(System.in);
                    int t_coordenadaY = t_coordy.nextInt();

                    System.out.print(" ---> Radio del circulo: ");
                    Scanner t_lado = new Scanner(System.in);
                    int t_ladoCuadrado = t_lado.nextInt();

                    Figura figura3 = new Circulo(t_coordenadaX, t_coordenadaY,t_ladoCuadrado);
                    listaFiguras.add(figura3);

                    contador++;

                    break;

                default:

                System.out.println(" Debe ingresar un valor valido entre 1 y 2 ");

                    break;
            }
        }

        System.out.println("------------------------------------------------------");

        static void dibujar(){
            
        }

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
