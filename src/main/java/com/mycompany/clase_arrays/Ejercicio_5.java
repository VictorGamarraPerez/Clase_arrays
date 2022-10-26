
package com.mycompany.clase_arrays;

import java.util.Arrays;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random()*100+1);
                if(i + j == matriz.length - 1){
                    suma = suma + matriz[i][j];
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString (matriz [i]));
        }
        System.out.println("La suma de la diagonal secundaria es : \n" + suma);
    }
}
