package com.mycompany.mavenproject1.newpackage.Array;

import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class Média {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, entradas = 5, sum = 0;
        int num[] = new int[entradas];
        double media=0;

        for (i = 0; i < entradas; i++) {
            num[i] = leia.nextInt();
            sum += num[i];
            media = (double)sum/num.length;
        }
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
            System.out.printf("%.2f", media);
    }
}
