package com.condicoesbasicas.app;

import java.util.Scanner;

public class AnalisaMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Qual é a primeira nota:");
        double nota1 = scanner.nextInt();

        System.out.println("Qual é a segunda nota:");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2)/2;

        System.out.println("A media de " + nome + " é de: " + media + " pontos.");

        if (media >= 7.0) {
            System.out.println("Parabéns você obteve um bom rendimento.");            
        };

        scanner.close();
    }
    
}
