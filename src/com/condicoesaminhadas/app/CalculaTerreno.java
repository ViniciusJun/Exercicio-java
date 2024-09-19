package com.condicoesaminhadas.app;

import java.util.Scanner;

public class CalculaTerreno {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        double largura;
        double comprimento;
        double area;

        System.out.println("Informe a largura do terreno: ");
        largura = terminal.nextDouble();
        System.out.println("Informe o comprimento do terreno: ");
        comprimento = terminal.nextDouble();

        terminal.close();

        area = largura*comprimento;

        if (area < 100) {
            System.out.println(area + "m², TERRENO POPULAR");
        } else if (area >= 100 && area <= 500) {
            System.out.println(area + "m², TERRENO MASTER");
        } else {
            if (area > 500) {
                System.out.println(area + "m², TERRENO MASTER");
            } else {
                System.out.println("Terreno não computado. Por favor verifique as dimenções do terreno.");
            }
        }
    }
}
