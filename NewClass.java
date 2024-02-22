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
public class NewClass {
     public static void main(String[] args) {
    Scanner teclado1 = new Scanner(System.in);
    int C = teclado1.nextInt();
    float F = C * 9/5 + 32;
    System.out.println(C+" graus Celsius corresponde a "+F+" graus Fahrenheit");    
  }
}

  
