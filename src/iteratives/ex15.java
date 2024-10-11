/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que cuente los múltiplos de 3 desde el 1 hasta un número que introducimos por teclado.
 * @author ves8167
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir número  y declarar variables
        System.out.println("Introduzaca el número del que quiera saber los multiplos: ");
        int num = entrada.nextInt();
        int cont = 0;
        //bucle para contar hasta el numero indicado
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0){ //que sea multiplo de 3
                cont++; //incremnetar contador
            }
        }
        if (cont > 0){ //mostrar cantidad de multiplos
        System.out.println("Cantidad de multipos de 3 son: "+cont);
        //} else {
        //System.out.println("No hay multiplos...");
        }
    }
}
