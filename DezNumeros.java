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
public class DezNumeros {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0, entrada,ateDez=0, ateVinte=0, maiorQueVinte=0;

        for (i = 0; i < 10; i++) {
            entrada = leia.nextInt();
            
            if(entrada>=0 && entrada<=10){
                ateDez++;
            }else if(entrada>=11 && entrada<=20){
                ateVinte++;
            }else if(entrada>=21){
                maiorQueVinte++;
            }
        }
                System.out.println(">=0 e <=10: "+ateDez);
                System.out.println(">=11 e <=20: "+ateVinte);
                System.out.println(">=21: "+maiorQueVinte);
    }
}
