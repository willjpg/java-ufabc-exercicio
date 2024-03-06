/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class ImparesPares {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0, valorEntrada, numRepeticao = 0;

        valorEntrada = leia.nextInt();

        while (numRepeticao < valorEntrada) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                numRepeticao++;
            }
            i++;
        }
        System.out.println();
        numRepeticao=0;
        i=0;
        while (numRepeticao < valorEntrada) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                numRepeticao++;
            }
            i++;
        }
    }
}
