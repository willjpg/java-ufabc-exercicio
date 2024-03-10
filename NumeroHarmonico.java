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
public class NumeroHarmonico {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i = 0, entrada; 
        double harmonico=0;
        entrada = leia.nextInt();
        
        
        for(i=1;i<=entrada;i++){
            harmonico += (double)1/i;
        }
        
        System.out.println(Math.ceil(harmonico * Math.pow(10, 1)) / Math.pow(10, 1));
    }
}
