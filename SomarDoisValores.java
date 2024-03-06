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
public class SomarDoisValores {
    public static int somar(int a, int b) {
    // Este método deve retornar o resultado da soma a + b
        Scanner leia = new Scanner(System.in);
        
        a = leia.nextInt();
        b = leia.nextInt();
    
        return (a+b);
   
    
}
}
