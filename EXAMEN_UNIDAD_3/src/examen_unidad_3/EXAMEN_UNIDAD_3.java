/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_unidad_3;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EXAMEN_UNIDAD_3 {

    /**
     * @param args the command line arguments
     */
    
        public static void main(String[] args) {
            //TODO code application logic here
        Scanner captu = new Scanner(System.in);

        //Solicitar el número de estudiantes
        System.out.print("Ingrese el numero de estudiantes: ");
        int numeroEstudiantes = captu.nextInt();

        //Validar que el número de estudiantes sea mayor a 0
        if (numeroEstudiantes <= 0) {
            System.out.println("El numero de estudiantes debe ser mayor a 0.");
            return;
        }

        //Crear el arreglo de calificaciones
        double[] calificaciones = new double[numeroEstudiantes];

        //Solicitar las calificaciones de los estudiantes
        for (int i = 0; i < numeroEstudiantes; i++) {
            System.out.print("Ingrese la calificacion del estudiante " + (i + 1) + ": ");
            double calificacion = captu.nextDouble();

            //Validar que la calificación esté entre 0 y 100
            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificacion debe estar entre 0 y 100. Intente de nuevo.");
                i--; // Decrementar para volver a pedir la calificación
            } else {
                calificaciones[i] = calificacion;
            }
        }

        //Calcular el promedio
        double promedio = calcularPromedio(calificaciones);

        //Contar cuántas calificaciones son mayores o iguales al promedio
        int cantidadMayoresAlPromedio = contarCalificacionesMayores(calificaciones, promedio);

        //Obtener la calificación más alta y la más baja
        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        //Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("Promedio de las calificaciones: " + promedio);
        System.out.println("Cantidad de estudiantes con calificacion mayor o igual al promedio: " + cantidadMayoresAlPromedio);
        System.out.println("La calificacion mas alta es: " + calificacionMasAlta);
        System.out.println("La calificacion mas baja es: " + calificacionMasBaja);
    }

    //Metodo para calcular el promedio
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    //Metodo para contar cuántas calificaciones son mayores o iguales al promedio
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    //Metodo para obtener la calificación más alta
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double masAlta = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > masAlta) {
                masAlta = calificacion;
            }
        }
        return masAlta;
    }

    //Metodo para obtener la calificación más baja
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double masBaja = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < masBaja) {
                masBaja = calificacion;
            }
        }
        return masBaja;
    }

}
