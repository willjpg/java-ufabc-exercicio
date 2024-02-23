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
public class Idades {

    public static void main(String[] args) {
        int a;
        Scanner leia = new Scanner(System.in);

        a = leia.nextInt();

        if (a >= 18 && a <65) {
            System.out.print("Maior de Idade!");
        } else if (a < 18 && a>0) {
            System.out.print("Menor de Idade!");
        } else if (a>=65){
            System.out.print("Maior de 65 anos!");
        } else if(a<=0){
            System.out.print("Idade Invalida!");
        }
    }

}
