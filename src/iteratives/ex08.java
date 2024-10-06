/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * un programa que lea una secuencia de números no nulos,
 * terminada con la introducción de un 0, y obtiene e imprime si ha
 * leído algún número negativo, cuantos positivos y cuantos negativos.
 * @author Val
 */
public class ex08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaramos las contadores y variable true/false
        int Npositius = 0;
        int Nnegatius = 0;
        //de momento indicamos que es falsa hasta detectar un N negativo
        boolean EsNegatiu = false; 
        //indicamos el valor inicial, el maximo permitido y el incremento
        int num;
        do {
            System.out.println("Introduzca un número (0 para terminar): ");
            num = entrada.nextInt();
            // incrementamos el contador de numeros positivos si lo es
            if (num > 0) {
                Npositius++;
            }
            // incrementamos el contador de numeros negativos si lo es y activamos el booleano
            else if (num < 0) {
                EsNegatiu = true;
                Nnegatius++;
            }
            // El bucle continúa hasta que se introduce un 0
        } while (num != 0);
        // Mostramos los resultados
        if (EsNegatiu) {
            System.out.println("Se han introducido " + Nnegatius + " número(s) negativo(s).");
        } else {
            System.out.println("No se han introducido números negativos.");
        }
        System.out.println("Se han introducido " + Npositius + " número(s) positivo(s).");
        }
}
