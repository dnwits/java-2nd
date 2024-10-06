/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que calcule el valor de elevar (sin hacer uso del operador
 * de potencia) un número real, A, a un número exponente entero, B.
 * @author Val
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir al usuario las variables A y B
        System.out.println("Introduzca el valor de A (la base): ");
        double a = entrada.nextDouble();
        System.out.println("Introduzca el valor de B (el exponente): ");
        int b = entrada.nextInt();
        double resultado = 1;
        // si el exponente positivo
        if (b > 0) {
            for (int i = 1; i <= b; i++) {
                resultado *= a;  //multiplicar A por sí mismo B veces
            }
        }
        //si el exponente 0 (cualquier número elevado a 0 es 1)
        else if (b == 0) {
            resultado = 1;
        }
        //cuando el exponente negativo
        else {
            for (int i = 1; i <= -b; i++) {
                resultado *= a;  //multiplicar A por sí mismo B veces (con B en positivo)
            }
            resultado = 1 / resultado;  //invertir resultado para el exponente negativo
        } //mostrar resultado
        System.out.println(a + " elevado a " + b + " es = " + resultado);
    }
}
