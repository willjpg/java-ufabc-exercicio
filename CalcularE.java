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
public class CalcularE {

    public static int calcularFatorial(int n) {
        int i = 0, mult = 1;

        for (i = n; i > 1; i--) {

            mult *= i;
        }

        //System.out.println(mult);
        return mult;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0, entrada, j = 1, mult = 1;
        double harmonico = 0;
        entrada = leia.nextInt();

        for (i = 1; i <= entrada; i++) {

            harmonico += (double) 1 / calcularFatorial(i);

        }

        System.out.println(Math.floor(harmonico * Math.pow(10, 1)) / Math.pow(10, 1));
    }
}
