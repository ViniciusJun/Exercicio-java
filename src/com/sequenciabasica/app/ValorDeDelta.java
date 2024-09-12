package com.sequenciabasica.app;
import java.util.Scanner;

public class ValorDeDelta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorA;
        int valorB;
        int valorC;
        double delta;
        //Solicita do usuario os valores de ABC.
        System.out.println("Qual é o valor de A? se for um valor decimal use vírgula.");
        valorA = scanner.nextInt();
        System.out.println("Qual é o valor de B? se for um valor decimal use vírgula.");
        valorB = scanner.nextInt();
        System.out.println("Qual é o valor de C? se for um valor decimal use vírgula.");
        valorC = scanner.nextInt();

        //Calcula o valor de delta
        delta = (valorB*valorB)-4*(valorA*valorC);

        //Imprime no console o valor de delta
        System.out.println("O valor de Delta é: " + delta);

        scanner.close();
    }
}
