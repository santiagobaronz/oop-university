package clases;

public class Estudiante extends Persona{

    private int curso;
    private int notaPromedio;

    public Estudiante(String nombre, String fechaNacimiento, String genero, String estadoCivil, int curso, int notaPromedio) {
        super(nombre, fechaNacimiento, genero, estadoCivil);
        this.curso = curso;
        this.notaPromedio = notaPromedio;
    }

}
