/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/**
 *
 * @author Willi
 * Entrada:

 

valor do investimento inicial
taxa de juros (anual)
período (em anos)
 

Saída:

 

dados do investimento conforme formato especificado no enunciado
 */
public class NewClass3 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int panos;
        double tj, vii, dadostotal=0, total;

         vii = leia.nextDouble();
         tj = leia.nextDouble();
         panos = leia.nextInt();
         
         dadostotal = Math.pow(tj+1, panos);
         total = vii * dadostotal;
         
         System.out.println(String.format("Valor = %.2f", vii));
         System.out.println(String.format("Taxa de juros = %.2f", tj));
         System.out.println("Tempo = "+ panos);
         System.out.println(String.format("Valor apos o periodo = %.2f", total));
        
    }
}
