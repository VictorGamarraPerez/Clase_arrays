
package com.mycompany.clase_arrays;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int[][] num = new int[3][3];
        Scanner numero= new Scanner(System.in); 
        System.out.println("Ingrese los números.");
        for (int i = 0; i < num.length; i++) {//Dimensión Uno. 
            for (int j = 0; j<num.length; j++) {//Dimensión Dos. 
                num[i][j]=numero.nextInt();
            }
        }
        System.out.println("Imprimiendo Tabla.");
        for (int i = 0; i < num.length; i++) {
        System.out.println();
            for (int j = 0; j < num.length; j++) {
            System.out.print(num[0][j] + " ");
            }
        }
        System.out.println("\nSuma Fila."); 
        int suma=0;
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){ 
                suma +=num[i][j];
            }
        System.out.println("Fila "+i+ "=" + suma); 
        suma=0;
        }
        System.out.println("\nSuma Columna"); 
        for (int i = 0; i < num.length; i++){ 
            for (int j = 0; j < num.length; j++) {
                suma += num[i][j];
        }
        System.out.println("Columna "+i+"="+suma);
        suma=0;
        }
    }
}
