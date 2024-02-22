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
public class ValidarSenha {
    public static void main(String[] args){
        String a;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextLine();
        
        
        if (a.equalsIgnoreCase("UFABC")){
            System.out.println("Acesso Liberado!");
        } 
        else{
            System.out.println("Acesso Negado!");
        }    
    }
}
