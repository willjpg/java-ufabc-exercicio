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
public class LinhaDeCredito {
    public static void main(String[] args){
        int a, b, pres;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        b  = leia.nextInt();
        
        pres = (a*30)/100;
                
        if (b <= pres ){
            System.out.println("Emprestimo Liberado!");
        } 
        else{
            System.out.println("Emprestimo Negado!");
        }    
    }
}