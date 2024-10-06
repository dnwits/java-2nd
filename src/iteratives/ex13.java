/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa donde el usuario "piensa" un número del 1 al 100 y
 * el ordenador lo adivina. (el usuario debe indicarle al
 * ordenador si es mayor, menor o igual).
 * @author Val
 */
public class ex13 {
    public static void main(String[] args) {
        //establecer variables de rango de numeros permitidos
        boolean continuar = true;
        Scanner entrada = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int anterior = 0;
        //pedirle al usuario que piense un numero 
        System.out.println("Piensa en un número del 1 al 100 y yo intentaré adivinarlo.");
        while (continuar) { //
            int num = (max + min)/2;
            if (num == anterior){
                num++;
            }
            System.out.println("El numero es " + num + "? (por favor, escribe: igual, menor o mayor)");
            String respuesta = entrada.nextLine().toLowerCase();
            if (respuesta.equals("menor")){
                max = num -1;
            } else if (respuesta.equals("mayor")){
                min = num + 1;
            } else if (respuesta.equals("igual")){
                System.out.println("Lo adiviné! :3");
                continuar = false;
            } else {
                System.out.println("... Repito, responde solo con 'mayor', 'menor' o 'igual'.");
            }
        } 
    }
}
