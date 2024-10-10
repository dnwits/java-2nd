/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que pida un número entero positivo y nos diga si es primo o no
 * @author ves8167
 */
public class ex16 {
    public static void main(String[] args) {
        //declarar varibles y pedir al usuario el numero
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número para saber si es primo o no: ");
        int num = entrada.nextInt();
        boolean primo = true;
        //para que sea primo debe ser numero natural mayor que 1 y 
        //sin ningún divisor aparte de sí mismos y el número uno
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                primo = false; // determinar que no es primo y cambiar valor booleano
                break;
                }
            } //mostrar mensaje final
            if (primo == true){
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
    }
}
