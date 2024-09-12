package com.sequenciabasica.app;
import java.util.Scanner;

public class CalculaPromoção {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorProduto;
        double valorPromocao;

        //solicita o valor do produto.
        System.out.println("Qual é o valor do produto?");;
        valorProduto = scanner.nextDouble();

        //Calcula o valor promocional.
        valorPromocao = valorProduto-(valorProduto*0.05);
        
        /*
        O método String.format() permite formatar números com um número específico de casas decimais.
        Aqui o %.2f indica que o número deve ser formatado como um número de ponto flutuante com 2 casas decimais.
        */
        String formatado = String.format("%.2f", valorPromocao);
        

        /*
        Imprime no console o valor da promoção. 
        A variavel valorPromocao passa a referenciar a variavel formatado para exibição mais precisa.
        */
        System.out.println("O valor do produto de R$" + valorProduto + ", receberá um desconto de 5% que equivale à R$" + formatado);

        scanner.close();
    }
}
