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
public class MaiorOuIgual {
    public static void main(String[] args){
        int a;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        
        if (a >= 3)
          System.out.print("Eh maior ou igual!");
        else
          System.out.print("Eh menor!");
    }
}
