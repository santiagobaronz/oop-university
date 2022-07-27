/*
*   Esta es la clase Orquetsta.
*   @Autor : Santiago Baron Zuleta, Claudia Tatiana Ospina, Santiago Morales Ariza
*   Fecha: 29 de Junio de 2022.
*/


package aplicacionorquesta;

import static aplicacionorquesta.Instrumento.tocar;
import java.util.ArrayList;


public class Orquesta {
    
    ArrayList<Instrumento> instrumentos;

    public Orquesta(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

    public ArrayList<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(ArrayList<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }
    
    public void afianar(Instrumento instrumento){ 
        System.out.println("Estoy.... afinando "+""+ instrumento.nombre);
    }
    
    public void concierto(Instrumento instrumento){
        tocar(instrumento);
    }
   
}
