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
public class PesoIdeal {
    public static void main(String[] args){
        int a;
        double man, woman, b;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        b  = leia.nextDouble();
        
        if (a == 0){
            man = (72.7*b) - 58;
            System.out.printf("Peso ideal eh: %.2f",man);
        }
          
        else if(a == 1){
            woman =(62.1*b) - 44.7;
            System.out.printf("Peso ideal eh: %.2f", woman);
        
        }    
    }
}
