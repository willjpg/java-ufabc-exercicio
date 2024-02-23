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
public class MaiorEntreTres {
     public static void main(String[] args){
        int a, b, c;
        Scanner leia = new Scanner(System.in);
    
        a  = leia.nextInt();
        b  = leia.nextInt();
        c  = leia.nextInt();
        
        
        if (a==b && a==c && b==c){
            System.out.print("Numeros Iguais!");
        }
          
        else if(b >= c && b >= a){System.out.print("Maior eh: "+b);
        
        }
        else if (a >= b && a >= c){System.out.print("Maior eh: "+a);
        } 
        else{
            System.out.print("Maior eh: "+c);
        }    
    }
}
