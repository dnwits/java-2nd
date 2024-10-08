/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;


/**
 * un programa que lea 100 números no nulos y
 * visualice un mensaje de si ha leído algún número negativo o no.
 * @author Val
 */
public class ex06 {
    public static void main(String[] args) {
        //declarar variables
        Scanner entrada = new Scanner(System.in);
        boolean esNegatiu = false;
        for (int i = 1; i <= 10 ; i++) {
            //pedimos que introduzcan los numeros
            System.out.println("Introduzca el numero " + i + ": ");
            int num = entrada.nextInt();
            if (num < 0) {
                esNegatiu = true; // cambiamos el valor boolean si encontramos un negativo
                //break;
            } 
        }//mensajes si se ha encontrado algun numero negativo o no
         if (esNegatiu) {
            System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }
    }
}