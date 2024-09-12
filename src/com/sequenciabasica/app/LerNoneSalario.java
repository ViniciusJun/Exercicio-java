package com.sequenciabasica.app;
/**
 * Este é um algoritimo desenvolido para ler um nome e o salario de um funcionario pelo console e posteriormente fazer uma exibição na tela.
 * @param  nomeFuncionario salva o nome do funcionário por meio do objeto Scanner.
 * @param salario guadar o valor do salario.
 * @param entradaValida valida se a entrada do valor é decimal por meio de um laço while e usando a classe InputMismatchException.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class LerNoneSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario = 0.0;
        boolean entradaValida = false;

        //Ler o nome.
        System.out.println("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        //Ler o salário.
        while (!entradaValida) {
            try {
                System.out.println("Agora informe o salário do funcionário: ");
                salario = scanner.nextDouble();  //Tenta ler um número decimal.
                entradaValida = true; // Se der certo, sai do laço.
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número decimal válido (use ponto ou vírgula).");
                scanner.next();  // Limpa a entrada inválida do buffer.
            }
        }

        //Exibindo informações
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Salário: " + salario);

        scanner.close();
    }
    
}
