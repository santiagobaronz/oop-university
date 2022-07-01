package co.edu.udistrital.poo.Clases;

/*
*   Esta clase hereda de la clase Persona.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

public class Estudiantes extends Persona{
    
    private int nota_1;
    private int nota_2;
    private int promedio;

    public Estudiantes(int nota_1, int nota_2, int promedio, String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.promedio = (nota_1 + nota_2) / 2;
    }
}


