/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofecha;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
/*
*   Clase principal.
*   @Autor : Santiago Baron Zuleta
*   Fecha: 01 de Julio de 2022.
*/

public class ProyectoFecha {
      
    static void ObtenerFechaActual(){
            // Fecha Actual
            Date miFecha = new Date();
            SimpleDateFormat miFormato = new SimpleDateFormat ("yyyy/MM/dd");
            String fechaActual = miFormato.format(miFecha);
            System.out.println("Fecha actual: " + fechaActual);
        }
        
        static void ObtenerHoraActual(){
            // Hora Actual
            DateTimeFormatter horaActual = DateTimeFormatter.ofPattern("HH:mm:ss");
            System.out.println("Hora actual: "+ horaActual.format(LocalDateTime.now()));
        }
        
        static void ObtenerFecha(int year, int month, int day){
            Date miFecha2 = new Date(year,month,day);
            SimpleDateFormat miFormato = new SimpleDateFormat ("yyyy/MM/dd");
            String fechaPropuesta = miFormato.format(miFecha2);
            System.out.println("------------------------------");
            System.out.println("Fecha conseguida: " + fechaPropuesta);
        }

    public static void main (String[] args) {
    

        int respuesta = 5;
        
        while(respuesta != 0){
            
            System.out.println("Escoja una opción:");
            System.out.println("1). Obtener fecha actual");
            System.out.println("2). Obtener Hora actual");
            System.out.println("3). Obtener Fecha");
            System.out.println("0). Cerrar programa");
            System.out.print("Respuesta: ");
            
            Scanner sc = new Scanner(System.in); 
            respuesta = sc.nextInt();
            
            System.out.println("------------------------------");
            
            switch(respuesta){
                case 1 -> ObtenerFechaActual();
                case 2 -> ObtenerHoraActual();
                case 3 -> {
                    System.out.print("Ingrese un año: ");
                    int year = sc.nextInt();
                    year = year - 1900;
                    
                    System.out.print("Ingrese un mes: ");
                    int month = sc.nextInt();
                    
                    System.out.print("Ingrese un dia: ");
                    int day = sc.nextInt();
                    
                    ObtenerFecha(year,month,day);
                }
                case 0 -> System.out.println("Finalizado");
            }
            
            System.out.println("------------------------------");
                    
        }
   
    }  
}
