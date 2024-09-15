package com.condicoesbasicas.app;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro qualquer:");
        int numero = scanner.nextInt();

        if (numero % 2 == 1) {
            System.out.println("O número informado é ímpar");
        } else {
            System.out.println("O número informado é par.");
        };

        scanner.close();
    }
    
}
