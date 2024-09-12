package com.sequenciabasica.app;
import java.util.Scanner;;

public class ConversorRealDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double reais;
        double dolar;

        //Solicita o valor da carteira do usuario
        System.out.println("Qual é a quantia em Reais que você tem em mãos?");
        reais = scanner.nextDouble();
        
        //Converte os valores
        dolar = reais*3.45;

        //Imprime o resultado da conversão
        System.out.println("O valor de R$ " + reais + " convertido para Dolar é de $ " + dolar);
        
        scanner.close();
    }
}
