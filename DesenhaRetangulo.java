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
public class DesenhaRetangulo {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, j = 0, entradaX, entradaY;

        entradaX = leia.nextInt();
        entradaY = leia.nextInt();
        
        if(entradaX<=2||entradaY<=2){
            System.out.println("Dimensoes fora das especificacoes.");
            return;
        }

        for (i = 1; i <= entradaX; i++) {
            //System.out.println("+");
            for (j = 1; j <= entradaY; j++) {
                if (i == 1 || i == entradaX || j == 1 || j ==entradaY) {
                    System.out.print("+");
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

                    /*for (j = 2; j < entradaY; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("+");*/