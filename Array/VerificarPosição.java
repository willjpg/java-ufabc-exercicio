package com.mycompany.mavenproject1.newpackage.Array;

import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class VerificarPosição {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, entradas, xEntrada, yEntrada = 0, soma = 0;

        entradas = leia.nextInt();
        int num[] = new int[entradas];

        for (i = 0; i < entradas; i++) {
            num[i] = leia.nextInt();
            //System.out.println(num[i]);
        }
        do {
            xEntrada = leia.nextInt();
            if (xEntrada >= num.length) {
                System.out.println("Valor de X invalido!");
                continue;
            }
            yEntrada = leia.nextInt();
            if (yEntrada >= num.length) {
                System.out.println("Valor de Y invalido!");
            }
        } while (xEntrada >= num.length && yEntrada >= num.length);

        soma = num[xEntrada] + num[yEntrada];
        System.out.println("Soma eh: " + soma);
        /*for (i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }*/
    }
}
