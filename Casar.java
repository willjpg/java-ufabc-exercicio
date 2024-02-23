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
public class Casar {
    public static void main(String[] args) {
        String a, b;
        Scanner leia = new Scanner(System.in);

        a = leia.nextLine();
        b = leia.nextLine();

        if (a.equalsIgnoreCase("SIM") && b.equalsIgnoreCase("SIM")) {
            System.out.print("COMPRE UMA BICICLETA");
        } else if (a.equalsIgnoreCase("NAO") && b.equalsIgnoreCase("NAO")) {
            System.out.print("COMPRE UMA BICICLETA");
        } else{
            System.out.print("CASE");
        }
    }

}

