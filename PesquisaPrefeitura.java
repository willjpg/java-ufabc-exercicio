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
public class PesquisaPrefeitura {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int idade, somaIdade = 0, somaSalario = 0, j = 0, salario, somaPercentualSalarioMenor = 0;
        double mediaIdade = 0, mediaSalario = 0, percentualSalarioMenor = 0;

        do {
            salario = leia.nextInt();
            if (salario <= 0) {
                break;
            }
            idade = leia.nextInt();

            if (salario < 800) {
                somaPercentualSalarioMenor++;
            }

            somaSalario += salario;
            somaIdade += idade;

            j++;

        } while (salario >= 0);

        if (j == 0) {
            return;
        }
        mediaSalario = (double) somaSalario / j;
        mediaIdade = (double) somaIdade / j;
        percentualSalarioMenor = (somaPercentualSalarioMenor * 100) / j;

        System.out.printf("O salario medio da populacao eh R$ %.2f e a idade media eh %.2f anos. O percentual da populacao com salario menor que R$ 800,00 eh %.2f.", mediaSalario, mediaIdade, percentualSalarioMenor);
        //System.out.println(mediaSalario);
        //System.out.println(mediaIdade);
        //System.out.println(percentualSalarioMenor);
    }
}
