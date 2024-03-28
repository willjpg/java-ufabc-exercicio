package com.mycompany.mavenproject1.newpackage.Array;

import java.util.Scanner;

/**
 *
 * @author Willi
 */
public class MaiorMenorParImpar {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int i = 0, y, entradas = 10, maior = 0, menor = 0, b = 0, a = 0;

        int num[] = new int[entradas];
        int vetor[] = new int[entradas];

        for (i = 0; i < num.length; i++) {
            num[i] = leia.nextInt();
            //System.out.println(num[i]);

        }
        int menorValor = num[0];

        // Percorra o array para encontrar o menor valor
        for (i = 1; i < 10; i++) {
            if (num[i] < menorValor) {
                menorValor = num[i];
            }

        }
        for (i = 0; i < num.length; i++) {
            boolean isUnique = true;
            for (y = i + 1; y < num.length; y++) {
                if (num[i] == num[y]) {
                    isUnique = false;
                    a++;
                    break;
                }
            }
            if (isUnique) {
                vetor[b] = num[i];
                b++;
            }
            if (num[i] > maior) {
                maior = num[i];
            }

        }

        System.out.println("Numeros pares:");
        for (i = 0; i < vetor.length - a; i++) {
            //System.out.println(vetor[i]);
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Numeros impares:");
        for (i = 0; i < vetor.length - a; i++) {
            //System.out.println(vetor[i]);
            if (vetor[i] % 2 != 0) {
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menorValor);

    }
}

/*
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        // Lendo os números do teclado e armazenando no vetor
        
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Encontrando o maior e o menor número
        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        
        boolean[] jaImprimiu = new boolean[11];
        System.out.println("Numeros pares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0 && !jaImprimiu[vetor[i]]) {
                System.out.println(vetor[i]);
                jaImprimiu[vetor[i]] = true;
            }
        }
        

        System.out.println("Numeros impares:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0 && !jaImprimiu[vetor[i]]) {
                System.out.println(vetor[i]);
                jaImprimiu[vetor[i]] = true;
            }
        }
        

        // Imprimindo o maior e o menor número
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}
*/
