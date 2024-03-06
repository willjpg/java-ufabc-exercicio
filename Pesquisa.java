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
public class Pesquisa {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int filhos, i, maisDeDois = 0, ateDoisFilhos = 0;

        for (i = 0; i < 3; i++) {

            filhos = leia.nextInt();
            if (filhos > 2) {
                maisDeDois++;
            } else {
                ateDoisFilhos++;
            }
        }
        System.out.println("Ate dois filhos: " + ateDoisFilhos);
        System.out.println("Mais de dois filhos: " + maisDeDois);

    }
}
