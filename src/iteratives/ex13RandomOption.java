/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ves8167
 */
public class ex13RandomOption {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Piensa en un número del 1 al 100 y yo intentaré adivinarlo.");
        Random aleatori = new Random();
        int min = 1, max = 100;
        int resposta;
        boolean continuar = true;
        do {
            int num = min + aleatori.nextInt(max - min);
            System.out.println("El numero es " + num + "?" ); 
            do { 
                System.out.println("Por favor, escribe: 1 para igual, 2 para menor o 3 para mayor): ");
                resposta = entrada.nextInt();
                if (resposta == 1){
                    continuar = false;
                    System.out.println("Lo adiviné! :3");
                    System.out.println("El número era "+ num);                 
                } else if (resposta == 2){
                    max = num;
                    System.out.println("Es más pequeño, next try...");
                } else if (resposta == 3){
                    min = num + 1;
                    System.out.println("Es más grande, next try...");
                } else {
                    System.out.println("Respuesta fuera de rango, por favor: 1 para igual, 2 para menor o 3 para mayor");
                }
            } while (resposta != 1 &&  resposta != 2 && resposta != 3);
        } while (continuar == true); 
    }
}
