/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.entrega;// aqui indica  adonde esta la clase//

public class Primos {// se crea la clase primos//

    public void mostrarPrimos() {// aqui se comienza acalcular los numeros primos//

        System.out.println("Numeros primos del 1 al 50:");// muestra el titulo en pantalla//

        // ciclo del 1 al 50 //
        for (int i = 1; i <= 50; i++) {

            int contador = 0;// cuenta cuantos divisorres tiene cada numero//

            // verificar divisores //
            
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) { //  verifica si j es divisor de i //
                    contador++;// si es divisor  suma 1 al cntador//
                }
            }

            // si tiene 2 divisores es primo//
            
            if (contador == 2) {
                System.out.println(i);
            }
        }
    }
}
