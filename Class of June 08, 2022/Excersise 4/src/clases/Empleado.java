package clases;

public class Empleado extends Persona{

    private int nomina;
    private String tipoDeEmpleado;

    public Empleado(String nombre, String fechaNacimiento, String genero, String estadoCivil, int nomina, String tipoDeEmpleado) {
        super(nombre, fechaNacimiento, genero, estadoCivil);
        this.nomina = nomina;
        this.tipoDeEmpleado = tipoDeEmpleado;
    }

}
