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
public class CrescenteDecrescente {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int i, a;
        
        a = leia.nextInt();
        
        for(i=0; i<=a; i++){
            System.out.print(i+" ");   
        }
        System.out.println();
        for(i=a; i>=0; i--){
            System.out.print(i+" ");   
        }
    }
}
