package com.sequenciabasica.app;
import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salario;
        double novoSalario;

        //solicita o valor do salrio.
        System.out.println("Qual é o valor do antigo salário?");;
        salario = scanner.nextDouble();

        //Calcula o valor do aumento salarial.
        novoSalario = salario+(salario*0.15);
        
        /*
        O método String.format() permite formatar números com um número específico de casas decimais.
        Aqui o %.2f indica que o número deve ser formatado como um número de ponto flutuante com 2 casas decimais.
        */
        String formatado = String.format("%.2f", novoSalario);
        

        /*
        Imprime no console o valor da promoção. 
        A variavel novoSalario passa a referenciar a variavel formatado para exibição mais precisa com duas casas decimais apos a vírgula.
        */
        System.out.println("O valor do salário de R$" + salario + ", receberá um aumento de 15% que equivale à R$" + formatado);

        scanner.close();
    }
}
