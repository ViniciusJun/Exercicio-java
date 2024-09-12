package com.sequenciabasica.app;
/**
 * Este é um algoritimo desenvolido para ler duas notas pelo console e posteriormente calcular a media entre eles.
 * @param notaUm salva a primeira nota por meio do objeto Scanner.
 * @param notaDois salva a primeira nota por meio do objeto Scanner.
 * @param media salvae calcula o valor da média entre as notas.
 * @param entradaValidaUm valida se a entrada do valor é decimal por meio de um laço while e usando a classe InputMismatchException.
 * @param entradaValidaDois valida se a entrada do valor é decimal por meio de um laço while e usando a classe InputMismatchException.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaDuasNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double notaUm = 0.0;
        double notaDois = 0.0;
        boolean entradaValidaUm = false;
        boolean entradaValidaDois = false;

        //Recebe e valida a entrada de dados via console.
        while (!entradaValidaUm) {
            try {
                System.out.println("Digite a primeira nota, use vírgula: ");
                notaUm = scanner.nextDouble();  //Tenta ler um número decimal.
                entradaValidaUm = true; // Se der certo, sai do laço.
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número decimal válido (use ponto ou vírgula).");
                scanner.next();  // Limpa a entrada inválida do buffer.
            }
        }
        while (!entradaValidaDois) {
            try {
                System.out.println("Digite a segunda nota, use vírgula: ");
                notaDois = scanner.nextDouble();  //Tenta ler um número decimal.
                entradaValidaDois = true; // Se der certo, sai do laço.
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número decimal válido (use ponto ou vírgula).");
                scanner.next();  // Limpa a entrada inválida do buffer.
            }
        }
        
        //Calcula a média das notas.
        double media = (notaUm+notaDois)/2;

        //Exibe as informações.
        System.out.println("A média entre " + notaUm + " e " + notaDois + " é " + media);
        scanner.close();
    }

}