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
public class MaiorDeIdade {
    public static void main(String[] args){
        int a, b;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        
        if (a > 18)
          System.out.print("Eh maior de idade!");
        else
          System.out.print("Nao eh maior de idade!");
    }
}
