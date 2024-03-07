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
public class ValorFunção {

    public static void main(String[] args) {

        int function = 0, d = 1;
        Scanner leia = new Scanner(System.in);
        int a = leia.nextInt();
        int b = leia.nextInt();
        int c = leia.nextInt();
        //function = a+∑bd=1(c.d);
        for (d = 1; d <= b; d++) {

            function += (c * d);

        }
        function+=a;
        System.out.println(function);

    }

    public static int obterValorFuncao(int a, int b, int c) {
        int function, d = 1;

        //function = a+∑bd=1(c.d);
        for (d = 1; d >= b; d++) {
            System.out.println(d);

        }

        return 0;

    }
}
