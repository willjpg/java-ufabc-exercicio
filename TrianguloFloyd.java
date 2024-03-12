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
public class TrianguloFloyd {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int i = 1, entrada, j = 0, soma = 0;
        

        entrada = leia.nextInt();

        for (i = 1; i <= entrada; i++) {
            System.out.println();
            for(j=1;j<=i;j++){
         
                soma++;
                System.out.print(soma+"    ");
            }
        }
    }
}
