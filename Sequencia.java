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
public class Sequencia {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int entrada, i=0, multipla = 0;
        entrada = leia.nextInt();

        for (i = 0 ; i < entrada; i++) {
            //System.out.println(i);
            
            multipla = (int) Math.pow(2, i);
            
            if(multipla>entrada){
                break;
            }else if(multipla>1){
                System.out.print(", ");
            } 
            System.out.print(multipla);        
            
        }
    }
}
