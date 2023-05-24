/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.
 */
package ejercicioaprendizaje3;

import java.util.Scanner;

public class EjercicioAprendizaje3 {
    public static void main(String[] args) {
        String frase;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa una frase: ");
        frase = entrada.nextLine();
        
        System.out.println("La frase toda en mayúscula es: "+frase.toUpperCase());
        System.out.println("La frase en minúscula es: "+frase.toLowerCase());
        
    }
    
}
