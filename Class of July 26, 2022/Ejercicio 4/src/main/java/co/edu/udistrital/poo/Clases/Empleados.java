package co.edu.udistrital.poo.Clases;

/*
*   Esta clase hereda de la clase Persona.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

public class Empleados extends Persona{
    
    private double sueldo;

    public Empleados(double sueldo, String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        this.sueldo = sueldo;
    }
    
    

    
}
