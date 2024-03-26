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
public class VetorInvertido {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, entradas = 6;
        int num[] = new int[entradas];

        for (i = 0; i < entradas; i++) {
            num[i] = leia.nextInt();
        }
        for (i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
