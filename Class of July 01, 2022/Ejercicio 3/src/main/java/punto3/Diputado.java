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

   public class Diputado extends Legislador{
   
    public Diputado(){
        super();
    }
   
    public Diputado(String dni,String nombre,int edad,String provinciaQueRepresenta){
        super(dni,nombre,edad,provinciaQueRepresenta);
    }

    Diputado(String yarviz, String suarez, String string, int i, String chiriqui, String diputado, boolean b, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    public String toString(){
       return super.toString();
    }
   
    public String getCamaraEnQueTrabaja(){
        return "Congreso";
    }
}



