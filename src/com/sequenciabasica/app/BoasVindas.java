package com.sequenciabasica.app;
/**
 * Este é um algoritimo desenvolido para ler um nome pelo console e posteriormente fazer uma saudação.
 * @param  nome salva o nome a ser saudado por meio do objeto Scanner.
 */

//Primeiro importamos a classe Scanner
import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
         
        //Cria um objeto Scanner
        Scanner scanner = new Scanner(System.in);
         
        //Ler o tipo de dado via console
        System.out.println("Qual é seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        
        //Fecha o Scanner
        scanner.close();
    }
}
