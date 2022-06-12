/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionorquesta;

import java.util.ArrayList;

/**
 *
 * @author lojani
 */
public class AplicacionOrquesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //crearmos los instrumentos
        Instrumento flauta = new Instrumento("flauta","flauta americano", "Viento", "somplando");
        Instrumento violin = new Instrumento("violin","violin americano", "Cuerda", "rascando");
        Instrumento bombo = new Instrumento("bombo","bombo americano", "Percución", "golpeando");

        //creamos la lista
        ArrayList<Instrumento> lista=new ArrayList<Instrumento>();
        //agregamos los instrumentos a la lista
        lista.add(flauta);
        lista.add(violin);
        lista.add(bombo);

        Orquesta orquesta = new Orquesta(lista);
        
        //afinar instrumentos
        orquesta.afianar(flauta);
        orquesta.afianar(violin);
        orquesta.afianar(bombo);
        
        
        System.out.println("EMPEZAMOS EL CONCIERTAZO");
        
        //tocar los instrumetos
        for (int i = 0; i < lista.size(); i++) {
            orquesta.concierto(lista.get(i));
        }
        
        
        
        

    }

}
