/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/**
 *N = 0,6 x NT + 0,4 x NP + 0,05 x ML
 * NT = 0,5 x PT1 + 0,5 x PT2
 * NP = 0,3 x PP1 + 0,5 x PP2 + 0,2 x MEP
 * @author Willi
 */
public class NewClass8 {
    public static void main(String[] args){
        int pt1,pt2,pp1, pp2, mep, ml;
        double nt, np, n;
        Scanner leia = new Scanner(System.in);
        
        pt1 = leia.nextInt();
        pt2 = leia.nextInt();
        pp1 = leia.nextInt();
        pp2 = leia.nextInt();
        mep = leia.nextInt();
        ml = leia.nextInt();
        
        np = 0.3 * pp1 + 0.5 * pp2 + 0.2 * mep;
        nt = 0.5 * pt1 + 0.5 * pt2;
        n = 0.6 * nt + 0.4 * np + 0.05 * ml;
        
        System.out.println(nt);
        System.out.println(np);
        System.out.println(n);

        
        
    }
}
