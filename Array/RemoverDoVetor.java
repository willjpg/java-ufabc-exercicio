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
public class RemoverDoVetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, y, entradas, ultimoNum, b = 0;

        entradas = leia.nextInt();

        int num[] = new int[entradas];
        int vetor[] = new int[entradas];

        for (i = 0; i < num.length; i++) {
            num[i] = leia.nextInt();
            //System.out.println(num[i]);
        }
        ultimoNum = leia.nextInt();
        for (i = 0; i < num.length; i++) {
            boolean isUnique = true;
            for (y = i + 1; y < num.length; y++) {
                if (num[ultimoNum] == num[i]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                vetor[b] = num[i];
                b++;
            }
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        entradas++;
        if (vetor[vetor.length - 1] != -1) {
            vetor[vetor.length - 1] = -1;
        }
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
