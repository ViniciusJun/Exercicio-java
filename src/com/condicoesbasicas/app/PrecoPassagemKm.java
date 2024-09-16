package com.condicoesbasicas.app;

import java.util.Scanner;

public class PrecoPassagemKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distancia = 0.0;
        double passagem = 0.0;

        System.out.println("Qual é a quilometragem da viagem?");
        distancia = scanner.nextDouble();

        if (distancia > 200.0) {
            passagem = distancia*0.45;
            //Aqui o final do comando "out.printf" formata a saida dos valores o "%.2f%n" define quantas casas vao ser exibida apos o ponto.
            System.out.printf("A passagem vai ficar no valor de R$%.2f%n", passagem);
        } else {
            passagem = distancia*0.50;
            //Aqui o final do comando "out.printf" formata a saida dos valores o "%.2f%n" define quantas casas vao ser exibida apos o ponto.
            System.out.printf("A passagem vai ficar no valor de R$%.2f%n", passagem);
        };
        
        scanner.close();
    }
}
