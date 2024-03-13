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
public class MediaAdolescentes {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int i = 0, entrada, idade, soma = 0, j = 0;
        double media = 0;
        entrada = leia.nextInt();

        if (entrada <= 2) {
            System.out.println("Poucos participantes para a pesquisa.");
        } else {

            for (i = 1; i <= entrada; i++) {

                idade = leia.nextInt();
                if (idade >= 12 && idade < 18) {
                    soma += idade;
                    j++;
                } else {
                    entrada++;
                }
            }
            media =(double)soma / j;
            System.out.println("A idade media dos "+j+" adolescentes é "+media+" anos.");
        }
    }
}
