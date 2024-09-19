package com.condicoesaminhadas.app;

import java.util.Scanner;

public class ComparadorMaiorMenor {
    
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite um número :");
        int numero1 = terminal.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = terminal.nextInt();
        
        terminal.close();

        if (numero1 > numero2) {
            System.out.println("O primeiro valor é maior, " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("O segundo valor é maior, " + numero2);
        } else {
           System.out.println("os valores são iguais, " + numero1 + ", " + numero2); 
        }

    }

}
