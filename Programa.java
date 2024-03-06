package com.mycompany.mavenproject1.newpackage;

import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class Programa {

    public static int obterPrazoEntrega(int disco1, int disco2, int disco3) {
        // Este método deve retornar o prazo de entrega
        int val = 0;

        if (disco1 == disco2 && disco1 == disco3 && disco2 == disco3) {
            val = val + 5;
        } else if (disco1 == disco2 || disco1 == disco3 || disco2 == disco3) {
            val = val + 15;
        } else {
            val = val + 30;
        }

        System.out.println("val");

        return val;

    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int d1 = leitor.nextInt();
        int d2 = leitor.nextInt();
        int d3 = leitor.nextInt();
        int resultado = Programa.obterPrazoEntrega(d1, d2, d3);
        System.out.println("Disco1 = " + d1);
        System.out.println("Disco2 = " + d2);
        System.out.println("Disco3 = " + d3);
        System.out.println("Prazo de entrega = " + resultado);
    }

}

