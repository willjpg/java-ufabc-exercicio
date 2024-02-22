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
public class NumerosIguais {
    public static void main(String[] args){
        int a, b;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        b  = leia.nextInt();
        
        if (a < b){System.out.print("Menor eh: "+a);
        }
          
        else if(a == b){System.out.print("Numeros iguais!");
        
        }
         
        else{
            System.out.print("Menor eh: "+b);
        }    
    }
}

