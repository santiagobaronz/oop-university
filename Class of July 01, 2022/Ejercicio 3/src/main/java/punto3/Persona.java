/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/*
*   Esta es la clase Persona.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

    public class Persona{
    private String dni;
    private String nombre;
    private int edad;
   
    public Persona(){
        dni="";
        nombre="";
        edad=0;
    }
   
    public Persona(String dni,String nombre,int edad){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
    }
   
    public String toString(){
        return "Dni : "+dni+"\nNombre : "+nombre+"\nEdad : "+edad;
    }

}
