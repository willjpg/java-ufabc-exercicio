/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/**
 *= new Scanner(System.in);
 * @author Willi
 */
public class NewClass1 {
     public static void main(String[] args){
         Scanner teclado1 = new Scanner(System.in);
         
         System.out.println("De:<endereço remetente>");
         String de = teclado1.nextLine();
         System.out.println("Para:<endereço destinatário>");
         String para = teclado1.nextLine();
         System.out.println("Mensagem:<texto da mensagem>");
         String msg = teclado1.nextLine();
         
         System.out.println("De:" + de);
         System.out.println("Para:" + para);
         System.out.println("Mensagem:" + msg);
                 
                 
     }
    
}
