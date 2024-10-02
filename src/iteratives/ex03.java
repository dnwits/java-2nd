/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

/**
 *
 * @author ves8167
 */
public class ex03 {
    public static void main(String[] args) {
         //programa que muestre los números pares
        //comprendidos entre el 1 y el 200, sumando de 1 en 1
        final int limite = 200;
        int contador = 1;
        //declaramos las variables, se inicia el contador y se incrementa
        while (contador <= limite) {
           if (contador % 2 == 0) { //para comprobar que consiga numeros pares
               System.out.println(contador); //que aparezcan por pantalla
           }
           contador++; //se suma 1 más hasta que sea par
        }
    }
}