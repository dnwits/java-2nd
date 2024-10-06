/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

import java.util.Scanner;

/**
 * programa que lee una secuencia de notas (con valores que van de 0 a 10) 
 * que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * @author Val
 */
public class ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaramos la variable nota y la booleana por si aparece un 10
        int nota;
        boolean diez = false;
        //pedimos los datos al usuario
        System.out.println("Introduzca las notas (del 0 - 10). Cuando haya terminado de poner las notas, finalice con -1:");
        nota = entrada.nextInt();
        //comenzamos el bucle
        while (nota != -1) {
            if (nota == 10) {
                diez = true;
            }
            //mensaje de error si se introduce un valor no permitido
            if (nota >=11)
                System.out.println("Nota fuera del rango permitido...");
            //leer la siguiente nota
            nota = entrada.nextInt();
        }
        //verificamos si hubo alguna nota con valor 10
        if (diez) {
            System.out.println("Hay al menos una nota de 10.");
        } else {
            System.out.println("No hay notas de 10.");
        }
    }
}
