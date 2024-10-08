/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

/**
 * Programa que mostra per pantalla els números parells entre l'1 i
 * el 200, sumant de en 2
 * @author ves8167
 */
public class ex02 {
    public static void main(String[] args) {
        //programa que muestre los números pares
        //comprendidos entre el 1 y el 200, sumando de 2 en 2
        final int limit = 20;
        //Declaramos el valor hasta el que queremos llegar y donde comenzar
        //teniendo en cuenta que los numeros deben ser pares
        for (int i = 2; i <= limit; i+= 2) { //incrementamos 2 para cumplir con el enunciado
            System.out.println(i); //mostrar por pantalla
        }
        //Imprimir un salt de línea un cop ja ha acabat el bucle
        //System.out.println("\n");
    }
}
