
package aplicacionorquesta;

public class Instrumento {
    String nombre;
    String descripcion;
    String clasificacion;
    String sonido;

    public Instrumento(String nombre, String descripcion, String clasificacion, String sonido) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clasificacion = clasificacion;
        this.sonido = sonido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

 
    static void tocar(Instrumento instrumento){
        
        String termino=instrumento.nombre=="flauta" ? "una" : "un";
        System.out.println("Estoy "+ instrumento.sonido +" "+termino+" "+ instrumento.nombre);
    }
    
    
    
    
    
    
}
