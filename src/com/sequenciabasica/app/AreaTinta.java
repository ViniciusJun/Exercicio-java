package com.sequenciabasica.app;
import java.util.Scanner;

public class AreaTinta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double altura;
        double largura;
        double areaTotal;
        double tinta;

        //Solicita ao usuario as medidas da parede.
        System.out.println("Qual a altura da parede? use vírgula.");
        altura = scanner.nextDouble();
        System.out.println("Qual é a larguar da parede? use vírgula.");
        largura = scanner.nextDouble();

        //Calcula a área total e a quantidade de tinta.
        areaTotal = altura*largura;
        tinta = areaTotal/2;

        //Imprime no console a quantidade de tinda por metros quadrados de parede.
        System.out.println("Para pintar uma parede de " + areaTotal + "m², será preciso uma quantidade de " + tinta + " litros de tinta.");
        scanner.close();
    }
}
