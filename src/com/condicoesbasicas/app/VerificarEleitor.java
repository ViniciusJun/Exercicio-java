package com.condicoesbasicas.app;
import java.util.Scanner;

public class VerificarEleitor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual;
        int anoNascimento;
        int idade;

        System.out.println("Em que ano estamos?");
        anoAtual = scanner.nextInt();

        System.out.println("Qual foi o ano em que você nasceu?");
        anoNascimento = scanner.nextInt();

        //Calcula a idade do usuario.
        idade = anoAtual-anoNascimento;

        //Condicional simples que valida se o individuo tem idade suficiente para votar.
        if (idade >= 16) {
            System.out.println("Parabéns! Com a idade de " + idade + " anos, você pode votar.");            
        } else {
            System.out.println("Que pena você não pode votar, sua idade de " + idade + " anos é insuficiente.");
        };

        scanner.close();
    }
}
