package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Willi
 */
public class BaseExpoente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 1, entradaA, entradaB, expoente = 1, expoente2 = 1, j = 0, soma = 0;

        entradaA = leia.nextInt();
        entradaB = leia.nextInt();

        for (i = 1; i <= entradaB; i++) {

            expoente *= entradaA;


        }
            System.out.println(expoente);
    }
}
