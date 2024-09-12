package com.sequenciabasica.app;
import java.util.Scanner;

public class CauculoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dias;
        double salario;

        System.out.println("Quantos dias você trabalhou no mês?");
        dias = scanner.nextInt();

        //Calcula e formata o valor do salário.
        salario = (25*8)*dias;
        String formatado = String.format("%.2f", salario);

        //Imprime o valor do salario com relação aso dias trabalhados.
        System.out.println("O seu salario é de: R$" + formatado);
        scanner.close();
    }
}
