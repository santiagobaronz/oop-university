package co.edu.udistrital.poo.Clases;

/*
*   Esta clase hereda de la clase Persona.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

public class Comercial extends Persona{
    
    private String cargo;

    public Comercial(String cargo, String nombre, String genero, int edad) {
        super(nombre, genero, edad);
        this.cargo = cargo;
    }
    
    
    
}
