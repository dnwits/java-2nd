/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 *un programa que lea un número positivo N y
calcule y visualice su factorial N!
Siendo el factorial:
0! = 1
1! = 1
2! = 2 * 1
3! = 3 * 2* 1
N! = N * (N-1) * (N-2)........* 3*2*1
 * @author Val
 */
public class ex05 {
    public static void main(String[] args) {
        //demanar dades a l'usuari
        Scanner entrada = new Scanner(System.in);
        System.out.println("FACTORIAL DE: ");
        //declarar variable numero
        int num = entrada.nextInt();
        int fact = 1;
        //mesaje error si el numero no es positivo
        if (num < 0) {
            System.out.println("El número debe ser positivo...");
        } else {
            //realizar el factorial
            
            for (int i = 1; i <= num; i++){
                fact *= i;
            }
            //mostrar resultado
            System.out.println("El factorial de " + num + " es: " + fact);
        }
    }
}
