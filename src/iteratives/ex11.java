/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

/** programa que suma independientemente los pares y los impares de 
 * los números comprendidos entre 100 y 200
 * @author Val
 */
public class ex11 {
    public static void main(String[] args) {
        //establecemos las variables para tener un resgistro de par, impar y el contador
        int pares = 0;
        int impares = 0;
        int cont = 100;
        //bucle for ya que comienza en el 100 y acaba en el 200
        for (int i = cont; i <= 200; i++) {
            //verificar si es par e incremento del contador par
            if (i % 2 == 0){
                pares += i;
            //incremento del contador impar si no es par
            } else {
                impares += i;
            }      
        }
        //mostrar resultado de pares e impares
        System.out.println("La suma total de los pares es " + pares);
        System.out.println("La suma total de los impares es " + impares);
    }
}
