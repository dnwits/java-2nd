/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que dada una cantidad de euros (múltiplo de 5)
 * realizar el desglose de billetes (500,200,100,50,20,10,5),
 * siempre intentando dar el mínimo de billetes posible.
 * @author Val
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //pedir la cantidad de € que el usuario quiere
        System.out.println("Escriba la cantidad en €: ");
        int cantidad= entrada.nextInt();
        //que la cantidad sea multiplo de 5
        if (cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser múltiplo de 5.");
        } else {
            //declarar los billetes disponibles con matrices y poner los valores que comprende
            int[] billetes = {500, 200, 100, 50, 20, 10, 5};
            int[] cantidadBilletes = new int[billetes.length]; //contar el numero de cada billete
            //desglose de los billetes
            int i = 0;
        while (cantidad > 0) {            
             if (cantidad >= billetes[i]) {
                    cantidadBilletes[i] = cantidad / billetes[i]; //numero de billetes de la denominación actual
                    cantidad = cantidad % billetes[i]; //actualizar el valor de euros
                }
                i++;
            }
            //mostrar resultado
            System.out.println("Desglose de billetes:");
            for (int j = 0; j < billetes.length; j++) {
                if (cantidadBilletes[j] > 0) {
                    System.out.println("Billetes de " + billetes[j] + "€: " + cantidadBilletes[j]);
                }
            }
        }
    }
}
