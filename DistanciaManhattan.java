/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.newpackage;

/**
 *
 * @author Willi
 */
public class DistanciaManhattan {
    public static int distanciaManhattan(int x1, int y1, int x2, int y2) {
    // Este método deve retornar a distância de Manhattan
    int res1=0, res2=0, total;

        
        res1 = Math.abs(x2-x1);
        res2 = Math.abs(y2-y1);
        total = res1 + res2;
    
    return total;
            }
}
