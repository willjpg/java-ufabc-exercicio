package com.mycompany.mavenproject1.newpackage;
import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class NewClass2 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int x1, x2, y1, y2,res1=0, res2=0, total;

         x1 = leia.nextInt();
         y1 = leia.nextInt();
         x2 = leia.nextInt();
         y2 = leia.nextInt();
        
        res1 = Math.abs(x2-x1);
        res2 = Math.abs(y2-y1);
        total = res1 + res2;
        
        System.out.println(total);

    }
}
