package com.sequenciabasica.app;
import java.util.Scanner;

public class AntecessoSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Informe um número inteiro:");
        numero = scanner.nextInt();

        System.out.println("o antecessor de " + numero + " é " + (numero-1) + " e o sucessor é " + (numero+1));

        scanner.close();
    }
}
