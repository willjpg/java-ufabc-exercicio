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
public class SubtraçãoVetor {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, sub = 0, negativos = 0, entrada;
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];

        for (i = 0; i < arrayA.length; i++) {
            arrayA[i] = leia.nextInt();
        }
        for (i = 0; i < arrayB.length; i++) {
            arrayB[i] = leia.nextInt();
        }
        for (i = 0; i < 5; i++) {
            sub = arrayA[i] - arrayB[i];
            System.out.println(sub);
        }

    }
}
