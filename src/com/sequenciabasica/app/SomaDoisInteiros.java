package com.sequenciabasica.app;
/**
 * Este é um algoritimo desenvolido para ler dois numeros inteiros pelo console e posteriormente fazer uma soma entre eles.
 * @param numeroUm salva o primeiro número por meio do objeto Scanner.
 * @param numeroDois salva o segundo número por meio do objeto Scanner.
 * @param soma salva o valor da soma.
 */

import java.util.Scanner;

public class SomaDoisInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroUm = 0;
        int numeroDois = 0;

        System.out.println("Digite o primeiro número inteiro: ");
        numeroUm = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        numeroDois = scanner.nextInt();

        int soma = numeroUm + numeroDois;

        //Exibindo as informações
        System.out.println("A soma entre " + numeroUm + " e " + numeroDois + " é " + soma);

        scanner.close();
    }
}
