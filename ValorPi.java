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
public class ValorPi {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0;
        double pi = 0;

        int b = leia.nextInt();
        //int c = leia.nextInt();

        for (i = 0; i <= b; i++) {

            pi = (pi + 4 * (Math.pow((-1), i) / (2 * i + 1)));

        }
        System.out.println(pi);
    }

        public static double calcularPi(int n) {
        int i = 0;
        double pi = 0;
        
        for (i = 0; i <= n; i++) {

            pi = (pi + 4 * (Math.pow((-1), i) / (2 * i + 1)));
            
        }
        return pi;
}
}