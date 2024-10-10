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
        int ultimo = -1;
        int totalnums = 0; //numeros aceptados
        int totalerror = 0; //numeros fallados
        int totalgen=0; //la suma de los anteriores
        do { //comenzar bucle pidiendo valor inicial
            System.out.print("Dime un número inicial (0 para terminar): ");
            num = entrada.nextInt();
            if (num > ultimo) {
                if (num != 0) {
                    totalnums++;  // incrementar los numeros correctos
                    ultimo = num;  // Actualizar el último número válido
                }
            } else if (num != 0) {
                totalerror++;  // incrementar contador de numeros fallados
                System.out.println("Fallo es menor"); //mostrar cuando haya un fallo
            }
            totalgen= totalnums + totalerror;
        } while (num != 0);
        // mostrar resultado
        System.out.println("Total de números introducidos: " + totalgen);
        System.out.println("Números fallados: " + totalerror);
        
    }
}
