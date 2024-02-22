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
public class NewClass7 {
    public static void main(String[] args){
        int a,b,c, quadrado, cubo, resto;
        Scanner leia = new Scanner(System.in);
        
        a = leia.nextInt();
        b = leia.nextInt();
        c = leia.nextInt();
        
        quadrado = (int) Math.pow(a, 2);
        cubo = (int) Math.pow(a, 3);
        resto = b%c;
        
        System.out.println("Quadrado de " + a + ": "+ quadrado);
        System.out.println("Cubo de "+ a +": "+ cubo);
        System.out.println("Resto de "+ b +" por 4: "+ resto);
}
}