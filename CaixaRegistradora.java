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
public class CaixaRegistradora {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double num = 1, total = 0, conta = 0, valorProduto;
        int quantidadeTotal = 0;
        while (num != 0) {
            num = leia.nextDouble();
            //System.out.println("aaa");
            if (num == 0) {
                break;
            } else {
                quantidadeTotal += num;
                //System.out.println(num);

                valorProduto = leia.nextDouble();
                conta = num * valorProduto;
                total += conta;
                //System.out.println(conta);
            }
        }
        System.out.println("Total: "+total);
        System.out.println("Quantidade: "+quantidadeTotal);
    }
}
