/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iteratives;

/**
 * un programa que calcula y escribe la suma y 
 * el producto de los 10 primeros números naturales.
 * @author Val
 */
public class ex09 {
    public static void main(String[] args) {
        //establecer las variables con las que trabajaremos
        int suma = 0;
        int producte = 1;
        int cont = 1;
        //crear el bucle para que sume y multiplique los 10 primeros numeros naturales
        while (cont <= 10){
            suma= suma + cont;
            producte= producte * cont;
            cont++; //incrementar el contador para que se cumpla el bucle
        }
        //mostrar el resultado final por pantalla en cuanto cont >= 10
        System.out.println("la suma és " + suma + " i el producte és " + producte+ ".");
    }
}
