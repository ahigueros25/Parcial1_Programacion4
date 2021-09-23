/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujmd.edu.consola;

import ujmd.edu.clases.EcuaciónCuadratica;
import java.util.Scanner;

/**
 *
 * @author Ale Higueros
 */
public class Parcial1_MH_VG {

    public static void main(String[] args) {
        EcuaciónCuadratica ecuacion = new EcuaciónCuadratica();
        Scanner reader = new Scanner(System.in);
        int seleccion = 0;
        System.out.println("\n*****************BIENVENIDO AL MENU DE OPCIONES*****************");
        System.out.println("Ejercicios del parcial");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Salir");

        while (seleccion != 4) {
            try {
                System.out.println("Seleccione el número de la acción a ejecutar");
                seleccion = reader.nextInt();
                switch (seleccion) {

                    case 1:
                        ecuacion.calcular();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:
                        System.out.println("Cerrando sesión... ¡Regresa pronto!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Acción no valida");
                }
            } catch (Exception datoErroneo) {
                System.out.println("Debe seleccionar una acción");
                reader.next();
            }
        }
    }

}
