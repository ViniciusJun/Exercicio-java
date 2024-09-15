package com.condicoesbasicas.app;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o ano para verificar se é bissexto?");
        int ano = scanner.nextInt();

        /*
         * Aqui "ano % 4 == 0", estamos verificando se o ano é divisível por 4.
         * Esta condição "ano % 100 != 0" verifica se o ano não é divisível por 100. Se um ano for divisível por 100, ele não é bissexto, a menos que seja divisível por 400.
         * Aque estamos verificando se o resto da divisão do ano por 100 não é zero (!= 0).
         * A condição "ano % 400 == 0" verifica se o ano é divisível por 400. Se o ano for divisível por 400, ele é bissexto, independentemente de ser divisível por 100.
         */
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0) ) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        };

        scanner.close();
    }
    
}
