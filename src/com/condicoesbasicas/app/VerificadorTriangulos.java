package com.condicoesbasicas.app;

import java.util.Scanner;

public class VerificadorTriangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reta1;
        int reta2;
        int reta3;
        int tipoTriangulo;

        System.out.println("Digite o valor do primeira reta: ");
        reta1 = scanner.nextInt();
        System.out.println("Digite o valor do segunda reta: ");
        reta2 = scanner.nextInt();
        System.out.println("Digite o valor do terceira reta: ");
        reta3 = scanner.nextInt();
        
        scanner.close();
        
          // Verifica se é possível formar um triângulo
        if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2) {
            System.out.println("Os valores informados podem formar um triângulo.");

              // Verifica o tipo de triângulo
            if (reta1 == reta2 && reta2 == reta3) {
                tipoTriangulo = 1;  // Equilátero
            } else if (reta1 == reta2 || reta1 == reta3 || reta2 == reta3) {
                tipoTriangulo = 2;  // Isósceles
            } else {
                tipoTriangulo = 3;  // Escaleno
            }

              // Utiliza switch para determinar o tipo
            switch (tipoTriangulo) {
                case 1: 
                    System.out.println("Este é um triângulo do tipo: EQUILÁTERO");
                    break;
                case 2: 
                    System.out.println("Este é um triângulo do tipo: ESÓSCELES");
                    break;
                case 3: 
                    System.out.println("Este é um triângulo do tipo: ESCALENO");
                    break;
                default: 
                    System.out.println("Erro ao determinar o tipo de triângulo.");
            }
        } else {
            System.out.println("Estas retas NÃO PODEM FORMAR um triângulo.");
        }
    }
}
