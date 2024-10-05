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
        for (int i = 1; i <= 4; i++) {
            //pedimos los numeros a leer
            System.out.println("Introduzca el numero " + i + ": ");
            int num = entrada.nextInt();
            //realizamos un incremento en el contador de numeros positivos
            if (num > 0){
            Npositius++;
            } else {
                //realizamos un incremento en el contador de numeros negativos si detecta alguno
                EsNegatiu = true; // cambiamos el valor boolean
                System.out.println("Se han detectado numeros negativos"); //mensaje de detección
                Nnegatius++;
                break;
            }
        } //mostramos el resultado por pantalla
        if(EsNegatiu){
            System.out.println("Se ha introducido " + Nnegatius + " numero negativos.");
            System.out.println("Se han introducido " + Npositius + " numeros positivos");
        }
    }
}
