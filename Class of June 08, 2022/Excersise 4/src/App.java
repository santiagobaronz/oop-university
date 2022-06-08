import java.util.ArrayList;
import java.util.Scanner;

import clases.Empleado;
import clases.Estudiante;
import clases.Persona;

public class App {
    public static void main(String[] args) throws Exception {

        int verificador = 0;
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

        System.out.println("-------------------------------------------");

        while(verificador == 0){

            System.out.println("Seleccione una opción para continuar");
            System.out.println("1). Estudiante");
            System.out.println("2). Empleado");
            System.out.println("3). Salir");
            System.out.print("Respuesta: ");
            Scanner respuesta = new Scanner(System.in);
            int respuestaFigura = respuesta.nextInt();

            switch (respuestaFigura) {
                case 1:

                    System.out.println("Creando estudiante, rellene los siguientes datos: ");
                    System.out.print("---> Nombre del estudiante: ");
                    Scanner ResEstScan_Nombre = new Scanner(System.in);
                    String ResEst_Nombre = ResEstScan_Nombre.nextLine();

                    System.out.print("---> Fecha de nacimiento del estudiante (DD/MM/YY): ");
                    Scanner ResEstScan_Fecha = new Scanner(System.in);
                    String ResEst_Fecha = ResEstScan_Fecha.nextLine();

                    System.out.print("---> Genero del estudiante: ");
                    Scanner ResEstScan_Genero = new Scanner(System.in);
                    String ResEst_Genero = ResEstScan_Genero.nextLine();

                    System.out.print("---> Estado civil del estudiante: ");
                    Scanner ResEstScan_Estado = new Scanner(System.in);
                    String ResEst_Estado = ResEstScan_Estado.nextLine();

                    System.out.print("---> Curso del estudiante: ");
                    Scanner ResEstScan_Curso = new Scanner(System.in);
                    int ResEst_Curso = ResEstScan_Curso.nextInt();

                    System.out.print("---> Nota promedio del estudiante: ");
                    Scanner ResEstScan_Nota = new Scanner(System.in);
                    int ResEst_Nota = ResEstScan_Nota.nextInt();

                    Persona estudiante = new Estudiante(ResEst_Nombre, ResEst_Fecha, ResEst_Genero, ResEst_Estado, ResEst_Curso, ResEst_Nota);
                    listaPersonas.add(estudiante);
                    break;

                case 2:
                    
                    System.out.println("Creando empleado, rellene los siguientes datos: ");
                    System.out.print("---> Nombre del empleado: ");
                    Scanner ResEmpScan_Nombre = new Scanner(System.in);
                    String ResEmp_Nombre = ResEmpScan_Nombre.nextLine();

                    System.out.print("---> Fecha de nacimiento del empleado (DD/MM/YY): ");
                    Scanner ResEmpScan_Fecha = new Scanner(System.in);
                    String ResEmp_Fecha = ResEmpScan_Fecha.nextLine();

                    System.out.print("---> Genero del empleado: ");
                    Scanner ResEmpScan_Genero = new Scanner(System.in);
                    String ResEmp_Genero = ResEmpScan_Genero.nextLine();

                    System.out.print("---> Estado civil del empleado: ");
                    Scanner ResEmpScan_Estado = new Scanner(System.in);
                    String ResEmp_Estado = ResEmpScan_Estado.nextLine();

                    System.out.print("---> Tipo de empleado: ");
                    Scanner ResEmpScan_Tipo = new Scanner(System.in);
                    String ResEmp_Tipo = ResEmpScan_Tipo.nextLine();

                    System.out.print("---> Nomina del empleado: ");
                    Scanner ResEmpScan_Nomina = new Scanner(System.in);
                    int ResEmp_Nomina = ResEmpScan_Nomina.nextInt();

                    Persona empleado = new Empleado(ResEmp_Nombre, ResEmp_Fecha, ResEmp_Genero, ResEmp_Estado, ResEmp_Nomina, ResEmp_Tipo);
                    listaPersonas.add(empleado);

                    break;

                case 3:
                    verificador = 1;
                    break;
            
                default:
                    System.out.println("Ingrese un digito valido");
                    break;
            }

            System.out.println("-------------------------------------------");

        }
    }
}
