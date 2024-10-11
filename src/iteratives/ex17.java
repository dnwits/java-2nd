/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
* programa que lea y acepte únicamente aquellos que sean mayores que el último
* dado. La introducción de números finaliza con la introducción de un 0. 
* Al final se mostrará:
* El total de números introducidos, excluido el 0.
* El total de números fallados.
 * @author Val
 */
public class ex17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //declarar variables
        int num; 
        int ultimo;
        int totalnums = 0; //numeros aceptados
        int totalerror = 0; //numeros fallados
        int totalgen; //la suma de los anteriores (total en general)
        //pedir valor inical y actualizar ultimo
        System.out.print("Dime un número inicial (0 para terminar): ");
        ultimo = entrada.nextInt();
        totalnums++; //incrementar contador
        do { //comenzar bucle teniendo valor inical y pidiendo el siguiente
             System.out.print("Dime un número: ");
             num = entrada.nextInt();
            if (num > ultimo) { // nuevo valor mayor que el valor inicial
                totalnums++;  // incrementar los números correctos
                ultimo = num;  // actualizar el último número válido  
            } else if (num != 0) { // si num no el mayor que ultim y diferent de 0
                totalerror++;  // incrementar contador de numeros fallados
                System.out.println("Fallo es menor."); //mostrar mensaje cuando haya un fallo   
            }        
        } while (num != 0); //condición para el bucle, que sea un número diff de cero
        // mostrar resultado
        totalgen= totalnums + totalerror;
        System.out.println("Total de números introducidos: " + totalgen);
        System.out.println("Números fallados: " + totalerror);
    }
}
