/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage.Array;

import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class ExisteNoVetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, soma = 0, negativos = 0, entrada;
        int[] array = new int[5];

        for (i = 0; i < array.length; i++) {
            array[i] = leia.nextInt();
        }
            entrada = leia.nextInt();
        for (i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                soma += array[i];
            } else {
                negativos++;
            }
        }
            System.out.println(negativos);
            System.out.println(soma);
            Existe(entrada, array);
            

    }

    public static int Existe(int b, int[] array) {
        //Scanner leia = new Scanner(System.in);

        //int[] array = {1, 2, 3, 4, 5};
        int i = 0;
        //b = leia.nextInt();
        boolean existe = false;
        for (i = 0; i < array.length; i++) {

            if (b == array[i]) {
                existe = true;
            }          
        }
        if (existe) {
            System.out.println("Existe!");
        } else {
            System.out.println("Nao existe!");
        }
        return 0;

    }
}
