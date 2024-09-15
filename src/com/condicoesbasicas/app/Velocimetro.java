package com.condicoesbasicas.app;
import java.util.Scanner;

/**
 * Este program foi feito para verificar se o carro esta acima do limite de 80km e se estiver efetuar uma multa calculada em 5 a cada kilometro acima.
 * @param velocidade armazena o valor da velocidade atual do veiculo.
 * @param multa variavel de escopo local que calcula a multa se caso houver.
 */

public class Velocimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a velocidade do carro?");
        double velocidade = scanner.nextDouble();
        
        //Condicional simples para verificar a velocidade e multar se estiver acima de 80km, noo valor de 5 a cada quilometro acima.
        if (velocidade > 80.0) {
            double multa = (velocidade - 80.0) * 5;
            System.out.println("Você foi multado no valor de R$:" + multa);
        } else {
            System.out.println("Você está dentro da velocidade permitida.");
        }

        scanner.close();
    }
}
