/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * un programa que lea 100 números no nulos y visualice un mensaje 
 * indicando cuántos son positivos y cuantos negativos.
 * @author Val
 */
public class ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declaramos las contadores y variable true/false
        int Npositius = 0;
        int Nnegatius = 0;
        //de momento indicamos que es falsa hasta detectar un N negativo
        boolean EsNegatiu = false; 
        //indicamos el valor inicial, el maximo permitido y el incremento
        for (int i = 1; i <= 100; i++) {
            //pedimos los numeros a leer
            System.out.println("Introduzca el numero " + i + ": ");
            int num = entrada.nextInt();
            //realizamos un incremento en el contador de numeros positivos
            if (num > 0){
            Npositius++;
            } else {
                //realizamos un incremento en el contador de numeros negativos si detecta alguno
                EsNegatiu = true; // cambiamos el valor boolean
                Nnegatius++;
            }
        } //mostramos el resultado por pantalla
        if(EsNegatiu){
            System.out.println("Se han leido " + Nnegatius + " numeros negativos.");
            System.out.println("Se han leido " + Npositius + " numeros positivos");
        }
    }
}
