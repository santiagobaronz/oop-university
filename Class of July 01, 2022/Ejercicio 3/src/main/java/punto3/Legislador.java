/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/*
*   Esta clase hereda de la clase Persona.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

    public abstract class Legislador extends Persona{
    private String provinciaQueRepresenta;
   
    public Legislador(){
        super();
        provinciaQueRepresenta="";
    }
   
    public Legislador(String dni,String nombre,int edad,String provinciaQueRepresenta){
        super(dni,nombre,edad);
        this.provinciaQueRepresenta=provinciaQueRepresenta;
    }
   
    public String toString(){
        return super.toString()+"\nProvincia a la que representa : "+provinciaQueRepresenta;
    }
   
    abstract public String getCamaraEnQueTrabaja();
   
   
}

