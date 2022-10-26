
package com.mycompany.clase_arrays;

//Leer 10 números enteros y mostrar 
//la media de los valores positivos 
//y la de los valores negativos.

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        // Contador para positivos y negativos
        int pos = 0;
        int neg = 0;
        int i;
        // suma de positivos y negativos
        double sumaPos = 0;
        double sumaNeg =0;
        //Lectura de valores por teclado y Guardado en arrays
        System.out.println("Lectura de los elementos del array : ");
        for ( i = 0; i < numeros.length; i++) {
            System.out.println("numeros [" + i + "] = ");
            numeros[i] = sc.nextInt();
        }
        // Se reconoce el array para sumar positivos y negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPos += numeros[i];
                pos++;
            } else  if (numeros[i] < 0) {
                sumaNeg += numeros[i];
                neg++;
            }           
            }
                //mostrar resultados
            if (pos != 0) {
                System.out.println("Media de los valores positivos : " + sumaPos / pos);
            } else {
                System.out.println("No ha introducido números positivos");
            }
            if (neg!=0) {
                System.out.println("Media de los valores negativos : " + sumaNeg / neg);
            } else {
                System.out.println("No ha introducido números negativos");
        }
    }
}
        