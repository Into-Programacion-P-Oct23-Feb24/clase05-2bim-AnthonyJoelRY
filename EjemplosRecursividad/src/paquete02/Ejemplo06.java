/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final
        
        for (int i = 0; i < valor1.length; i++) {
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(valor1[i], valor2[i]));
        }
        //Solo enviamos los valores que contengan los areglos en una 
        //posicion especifica para mediante un proceso recursivo realizar 
        //un proceso y presentarlo en pantalla
        
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(num1, num2));
        }
        //En cambio en el mismo almacenamos los valores de los arreglos 
        //en variables.
        
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            int suma = obtenerSuma(num1, num2); 
            System.out.printf("El valor es: %d\n", suma);
        }
        //Se realiza los mismo que lo anterior pero guardamos 
        //el proceso en una variable
        
        

    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
