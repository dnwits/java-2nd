/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;
/**
 * programa que pida un número entero N entre 0 y 20 y luego muestre por 
 * pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada 
 * número tantas veces como su valor
 * @author Val
 */
public class ex20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //pedir valor y declararlo
        System.out.println("Dime un número (entre 0 y 20): ");
        int num = entrada.nextInt();
        //crear bucle = a valor (se consiguen los valores de 1 hasta num)
        for (int i = 1; i <= num; i++) {
            for (int m = 1; m <= i; m++) { // bucle dentro de otro para que se repitan
            System.out.print(i); //mostrar los valores de 1 hasta num
            }
        System.out.println(); //salto final
        }
    }
}
