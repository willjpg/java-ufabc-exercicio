package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Willi
 */
public class Operações {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int num = 1, i = 0, menorResultado = 0, conta = 0, a, b, c;

        while (num != 0) {
            num = leia.nextInt();
            //System.out.println("aaa");
            if (num == 0) {
                break;
            } else if (num == 1) {
                a = leia.nextInt();
                b = leia.nextInt();

                conta = a + b;
                System.out.println("(a+b) = " + conta);

            } else if (num == 2) {
                a = leia.nextInt();
                b = leia.nextInt();
                c = leia.nextInt();

                conta = a + b + c;
                System.out.println("(a+b+c) = " + conta);

            } else if (num == 3) {
                a = leia.nextInt();
                b = leia.nextInt();

                conta = a * b;
                System.out.println("(a*b) = " + conta);

            }
            if (i == 0) {
                menorResultado = conta;
                i++;
            } else if (conta <= menorResultado) {
                menorResultado = conta;
            }
        }
        if (i != 0) {
            System.out.println("Menor resultado: " + menorResultado);
            
        } else {
            System.out.println("Nenhum calculo foi realizado!");
        }

    }
}
