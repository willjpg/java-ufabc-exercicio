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
public class Triangulos {

    public static void main(String[] args) {
        int a, b, c;
        Scanner leia = new Scanner(System.in);

        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.print("Eh Triangulo!");
            if (a == b && a == c && b == c) {
                System.out.print("\nEquilatero!");
            } else if (a == b || a == c || b == c) {
                System.out.print("\nIsosceles!");
            } else {
                System.out.print("\nEscaleno!");
            }
        } else {
            System.out.print("Nao eh Triangulo!");
        }
    }
}
