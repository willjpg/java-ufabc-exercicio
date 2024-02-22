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
public class DiferenteDeZero {
    public static void main(String[] args){
        int a;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        
        if (a == 0)
          System.out.print("Eh Zero!");
        else
          System.out.print("Eh diferente!");
    }
}

