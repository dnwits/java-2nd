/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que muestre los números desde el 1
 * hasta un número N que se introducirá por teclado.
 * @author ves8167
 */
public class ex04 {
    public static void main(String[] args) {
        //demanar les dades a l'usuari
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el número hasta el que desee listar: ");
        //declarem les variables
        int max = entrada.nextInt();
        int cont = 1;
        //indiquem el valor inicial, el valor màxim i que sumem d'un en un
        for(int i = cont ; max >= i ; i++) {
            //mostrem per pantalla el compte des d'un fins al valor max
            System.out.println(i); 
        }
    }
}
