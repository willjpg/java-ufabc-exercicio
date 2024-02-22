/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/**
 *
 * @author Willi double numero = 5.07507;
 * System.out.println(String.format("%.2f", numero));
 */
public class NewClass4 {

    public static void main(String[] args) {

        int base, altura;
        double area = 0;

        Scanner leia = new Scanner(System.in);

        base = leia.nextInt();
        altura = leia.nextInt();

        area = (double) base * altura / 2;
        
        System.out.println(String.format("Valor = %.2f", area));
             
    }
}
