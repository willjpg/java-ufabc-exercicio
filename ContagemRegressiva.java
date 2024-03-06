package com.mycompany.mavenproject1.newpackage;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Willi
 */
public class ContagemRegressiva {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int entrada, i;

        do {

            entrada = leia.nextInt();
            if (entrada >= 0) {
                for (i = entrada; i >= 0; i--) {
                    System.out.print(i + " ");
                    
                }
            }else{
                System.out.println("O numero deve ser >=0!");
                        
            }
            
        } while (entrada<0);
        System.out.println("");
        System.out.print("FIM!");
        
    }
}
