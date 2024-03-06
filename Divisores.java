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
public class Divisores {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 1, valorEntrada, soma = 0;

        valorEntrada = leia.nextInt();

        for (i = 1; i < valorEntrada; i++) {

            if (valorEntrada % i == 0) {
                soma += i;

            }

        }
        System.out.println(soma);
    }
}
