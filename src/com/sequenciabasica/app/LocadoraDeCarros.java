package com.sequenciabasica.app;
import java.util.Scanner;

public class LocadoraDeCarros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias;
        double kmRodados;
        double valorTotal;
        double valorDia = 90.0;
        double valorKm = 0.20;

        //Solicita os valores correspondentes a kilometragem e dias de aluguel.
        System.out.println("Por quantos dias o carro foi alugado?");
        dias = scanner.nextInt();
        System.out.println("Quantos quilometros ele rodou?");
        kmRodados = scanner.nextDouble();
        
        //Calcula o valor do automovel alugado.
        valorTotal = (dias*valorDia)+(kmRodados*valorKm);

        /*
        O método String.format() permite formatar números com um número específico de casas decimais.
        Aqui o %.2f indica que o número deve ser formatado como um número de ponto flutuante com 2 casas decimais.
        */
        String formatado = String.format("%.2f", valorTotal);

        //Imprime no cosole o valor do alugel do carro
        System.out.println("O valor do aluguel do carro foi de: R$" + formatado);

        scanner.close();
    }
}
