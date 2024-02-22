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
public class Decrescente {
    public static void main(String[] args){
        double a, b;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextDouble();
        b  = leia.nextDouble();
        
        if (a > b){
            System.out.print(a);
            System.out.print("\n"+b);
        }else{
            System.out.print(b);
            System.out.print("\n"+a);
        }
    }
}

