package com.condicoesaminhadas.app;

import java.util.Scanner;

public class NovoSalarioPorTempo {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        double novoSalario;

        System.out.println("Qual é o nome do funcionário?");
        String nome = terminal.nextLine();
        System.out.println("Quantos anos ele trabalha na empresa?");;
        int anos = terminal.nextInt();
        System.out.println("Qual é o seu salário? [USE VIRGULA]");
        double salario = terminal.nextDouble();
        
        terminal.close();

        if (anos < 3) {
            novoSalario = (salario * 0.03) + salario;
            System.out.println("O novo salário é de: R$" + novoSalario);
            System.out.println("O aumento foi de 3%: R$" + (salario * 0.03)); 
        } else if (anos >= 3 && anos < 10) {
            novoSalario = (salario * 0.125) + salario;
            System.out.println("O novo salário é de: R$" + novoSalario);
            System.out.println("O aumento foi de 12.5%: R$" + (salario * 0.125)); 
        } else {
            if (anos >= 10) {
                novoSalario = (salario * 0.2) + salario;
                System.out.println("O novo salário é de: R$" + novoSalario);
                System.out.println("O aumento foi de 20%: R$" + (salario * 0.2));  
            }
        }
    }
}
