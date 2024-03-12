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
public class CalcularSerie {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0, j = 0, entrada, m = 1;
        double harmonico = 0;
        entrada = leia.nextInt();

        for (i = 1; i <= entrada; i++) {
            //System.out.println(i);
            //System.out.println(m);

            harmonico += (double) i / m;
            m += 2;

        }
        //System.out.println(harmonico);
        //System.out.println(Math.ceil(harmonico * Math.pow(10, 2)) / Math.pow(10, 2));
        double resultado = Math.floor(harmonico * 100) / 100;
        double decimal = harmonico * 100 - resultado * 100;

        if (decimal >= 0.5) {
            resultado += 0.01;
        }

        System.out.println(resultado);
    }
}

