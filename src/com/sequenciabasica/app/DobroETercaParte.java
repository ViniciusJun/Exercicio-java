package com.sequenciabasica.app;
import java.util.Scanner;

public class DobroETercaParte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Informe um número decimal: ");
        numero = scanner.nextDouble();

        System.out.println("O dobro de " + numero +" é " + (numero*2) + ", e a terça parte é " + (numero/3));

        scanner.close();
    }
}
