/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.*;

public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        
        //Ingreso del tamaño del arreglo:
        System.out.print("Ingrese el tamaño del arreglo: ");
        int t = entrada.nextInt();
        
        //Arreglo 01 
        int[] arreglo = new int[t];
        
        //Llenado del arreglo 01
        System.out.println("Ingrese los valores del arreglo:");
        
        for (int i = 0; i < t; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = entrada.nextInt();
        }
        
        int suma = misterio(arreglo, arreglo.length);
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
