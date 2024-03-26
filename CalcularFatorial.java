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
public class CalcularFatorial {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, entradaFatorial, fatorial = 0;

        entradaFatorial = leia.nextInt();
        fatorial = entradaFatorial;
        for (i = entradaFatorial; i > 1; i--) {
            //for (j = entradaFatorial; j <= 0; j--) {
            fatorial = fatorial * (i - 1);
            //}
            //20
            //12
            //

        }
        if (entradaFatorial < 0) {
            return;
        } else if (entradaFatorial == 0) {
            fatorial = 1;
        }

        if (fatorial > 1000000) {
            System.out.println("Impossivel calcular com as restricoes de hardware.");
        } else {
            System.out.println("O fatorial de " + entradaFatorial + " eh " + fatorial + ".");
        }
    }
    //{\displaystyle n!=n * (n-1)!}      
}
