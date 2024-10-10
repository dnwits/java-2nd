/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;
/**
 * programa que pida un número y construya por pantalla su pirámide
 * @author Val
 */
public class ex22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // pedir numero para crear piramide y declarar variable
        System.out.println("Dime un número para realizar su pirámide: ");
        int num = entrada.nextInt();
        // bucle inicial para ir incrementando i hasta num
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) { //dejar los espacios antes de los "*" en la piramide
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * i - 1; m++) { // mostrar los * (m <= i)
            System.out.print("*");
            }
        System.out.println();
        }
    }
}
