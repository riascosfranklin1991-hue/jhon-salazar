/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ejercicios.entrega;

import java.util.Scanner; // permite leer datos  ingresados por teclado//

public class MenuPrimos { // esta es la clase principal creada//

    public static void main(String[] args) { // aqui empieza a ejecutarsew el codigo//

        Scanner sc = new Scanner(System.in);// aqui se lee lo que el usuario escribe//

        int opcion;// aqui se guarda la opcion del menu//

     
        Primos primos = new Primos();// aqui se crrea el objeto   dela clase primos //manejo de clases//

        do { // inicia un ciclo que  repite el menu una vez//
            
            //  aqui se muetra las opciones del usuario//

            System.out.println("===== MENU =====");
            System.out.println("1. Mostrar números primos del 1 al 50");
            System.out.println("2. Salir");
            System.out.print("Elija una opción: ");

            opcion = sc.nextInt(); //  lee y se guarda lo que el usuario escribe//

            switch (opcion) { //evalua   la opcion elegida//

                case 1:
                    primos.mostrarPrimos(); // ✔ CORRECTO
                    break;

                case 2:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 2);// se repite el menu hata que el usuario escriba 2//

        sc.close();// se cierra el ciclo//
    }
}



