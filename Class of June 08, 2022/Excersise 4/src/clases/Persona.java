package clases;

public abstract class Persona {

    private String nombre;
    private String fechaNacimiento;
    private String genero;
    private String estadoCivil;

    public Persona(String nombre, String fechaNacimiento, String genero, String estadoCivil){
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estadoCivil = estadoCivil;

    }

    public String getNombre(){
        return this.nombre;
    }
    
}
