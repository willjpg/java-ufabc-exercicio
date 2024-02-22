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
public class NewClass6 {
    public static void main(String[] args){
        int peso;
        Scanner leia = new Scanner(System.in);
        
        peso = leia.nextInt();
        
        double pesomais = (double)(peso * 34)/100 + peso;
        double pesomenos =  Math.abs((double)(peso * 13)/100 - peso);
        
        System.out.printf("Valor = %.2f", pesomais);
        System.out.printf("\nValor = %.2f", pesomenos);
       
        
    }

}
