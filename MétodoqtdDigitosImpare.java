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
public class MétodoqtdDigitosImpare {

    public static void main(String[] args) {
        //public static int qtdDigitosImpares(int n) {
        // digite o codigo do metodo aqui
        Scanner leia = new Scanner(System.in);
        int i = 0, temp, entrada, digito;

        entrada = leia.nextInt();

        temp = entrada;

        while (temp > 0) {
            digito = temp % 10;
            //System.out.println("Dígito: " + digito);
            temp /= 10;
            System.out.println("Dígito: " + temp);
            if (digito % 2 != 0) {
                i++;

            }
        }
        //System.out.println("Dígito: " + i);
        //for (i = 1; i <= numeroString.length(); i++) {

        //}
        //return 0;
    }

    public static int qtdDigitosImpares(int n) {
        // digite o codigo do metodo aqui
        int i = 0, temp, digito;

        temp = n;

        while (temp > 0) {
            digito = temp % 10;
            temp /= 10;
            if (digito % 2 != 0) {
                i++;

            }
        }
        //System.out.println("Dígito: " + i);
        
        return i;
    }
}
