/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

/**
 * programa para calcular la suma de los cuadrados de los 5 primeros números
 * naturales.
 * @author Val
 */
public class ex18 {
    public static void main(String[] args) {
        //declarar variable
        int suma = 0;
        // bucle for ya que es oslo 5 veces
        for (int i = 1; i <= 5; i++) { // valor inicial, condició e incremento para que se repita
            suma+= i * i; // incrementar sumando el cuadrado de los valores que se crean mediante el for
        } //mostrar resultado
        System.out.println("La suma total es " + suma);
    }
}
