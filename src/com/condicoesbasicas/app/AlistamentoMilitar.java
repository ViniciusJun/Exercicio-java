package com.condicoesbasicas.app;

import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode se alistar!");
        } else {
            int anosFaltantes = 18 - idade;
            System.out.println("Você não tem idade suficiente para o alistamento.");
            System.out.println("Aguarde mais " + anosFaltantes + " anos para poder se alistar.");
        }

        scanner.close();
    }
    
}
