/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

import java.util.ArrayList;

/*
*   Clase principal.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/

class Punto2 {
     public static void main(String[] args){
       
        ArrayList<Legislador> listaLegisladores = new ArrayList<Legislador>();
       
        listaLegisladores.add(new Diputado("11.111.111A", "Juan Bartolo Perdiguero",42,"A Coruña"));
        listaLegisladores.add(new Senador("11.111.111B", "Victoria González",45,"Cantabria"));
        listaLegisladores.add(new Diputado("22.222.222A", "Aitor Arritamendia",43,"Bizcaia"));
        listaLegisladores.add(new Senador("22.222.222B", "Paula Bartomeu",45,"Barcelona"));
        listaLegisladores.add(new Diputado("33.333.333A", "Ovido López",47,"León"));
        listaLegisladores.add(new Senador("33.333.333B", "Sabina Ramírez",45,"Valladolid"));
        listaLegisladores.add(new Diputado("44.444.444A", "Secundino Flores",48,"Zamora"));
        listaLegisladores.add(new Senador("44.444.444B", "Ana Isabel Tocino",40,"Soria"));
       
        System.out.println("Listado de legisladores\n");
        for(Legislador legislador:listaLegisladores){
            System.out.println("Representante en el : "+legislador.getCamaraEnQueTrabaja());
            System.out.println(legislador.toString()+"\n");     
        }
        System.out.println("Fin del listado de legisladores\n");
    }
}
