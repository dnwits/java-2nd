/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que pida dos número enteros A y B, siendo B mayor que A
 * Luego visualiza los números desde A hasta B e indicar cuantos
 * hay que sean pares
 * @author Val
 */
public class ex21 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir y declarar variables
        System.out.println("Introduzca el valor de A: ");
        int a = entrada.nextInt();
        System.out.println("Introduzca el valor de B (debe ser mayor que A): ");
        int b = entrada.nextInt();
        int cont_pares = 0;
        // bucle que comience desde A y llegue a B
        for (int i = a; i <= b; i++) {
            System.out.print(i+" "); //mostrar por pantalla el incremento
            if (i%2==0){
                cont_pares++; //incrementar contador de pares
            }
        } //mostrar resultado de pares
        System.out.println();
        System.out.println("La cantidad de pares son: "+ cont_pares);
    }
}
