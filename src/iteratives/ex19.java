/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que lea un número y a continuación escriba el carácter “*” tantas veces
 * igual al valor numérico leído. En aquellos casos en que el valor leído no sea 
 * positivo se deberá escribir un único asterisco.
 * @author Val
 */
public class ex19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir numero y declarara variable
        System.out.println("Dime un número: ");
        int num = entrada.nextInt();
        if (num <= 0){ //si el valor es negativo o 0 ig
                System.out.println("*");
        } else {
            for (int i = 1; i <= num; i++) {
            System.out.print("*"+ " "); //que aparezca "*" hasta llegar al valor num
            }
        System.out.println(); //salto después de mostrar resultado
        }
    }
}
