/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class NewClass5 {
    public static void main(String[] args){
        int ano, anoatual, idadeatual, futuro, anofuturo;
        Scanner leia = new Scanner(System.in);
        
        ano = leia.nextInt();
        anoatual = leia.nextInt();
        anofuturo = leia.nextInt();
        idadeatual = anoatual - ano;
        
        //idade = LocalDate.now().minusYears(ano).getYear();
        futuro = anofuturo - ano;
        
        System.out.println("Idade atual: "+ idadeatual);
        System.out.println("Em " + anofuturo+", a idade sera:"+futuro);
        
       
    }
           
           
            
}
