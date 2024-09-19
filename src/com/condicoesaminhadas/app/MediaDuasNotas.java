package com.condicoesaminhadas.app;

import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        double media;

        System.out.println("Digite a primeira nota: [USE VIRGULA] ");
        double nota1 = terminal.nextDouble();
        System.out.println("Digite a segunda nota: [USE VIRGULA] ");
        double nota2 = terminal.nextDouble();
  
        terminal.close();

        media = (nota1+nota2)/2;

        if (media >= 7.0) {
            System.out.println("ALUNO APROVADO, média: " + media);
        } else if (media >= 5.0 && media <= 6.9) {
            System.out.println("ALUNO EM RECUPERAÇÃO, média: " + media);
        } else {
            System.out.println("ALUNO REPROVADO, média: " + media);
        };
    }
}
