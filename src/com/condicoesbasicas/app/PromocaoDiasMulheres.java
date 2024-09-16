package com.condicoesbasicas.app;

import java.util.Scanner;

public class PromocaoDiasMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorProduto;
        int genero;
        double valorPromocao;

        System.out.println("O cliente é Homem[1] ou Mulher[2]? ");
        genero = scanner.nextInt();
        System.out.println("Qual é o valor do produto? Use virgula ao inves de ponto.");
        valorProduto = scanner.nextDouble();

        //Verifica o gereno do usuario e aplica a promoção correspondente.
        if (genero == 2) {
            valorPromocao = valorProduto-(valorProduto*0.13);
            System.out.println("Parabéns! por estarmos comemorando o dia das mulheres, você acaba de receber um desconto de 13%."); 
            System.out.println("O valor final do produto é de: " + valorPromocao);           
        } else { 
            valorPromocao = valorProduto-(valorProduto*0.05);
            System.out.println("Você acaba de receber um desconto de 5%."); 
            System.out.println("O valor final do produto é de: R$" + valorPromocao); 
        };

        scanner.close();
    }
}
