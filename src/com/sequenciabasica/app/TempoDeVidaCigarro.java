package com.sequenciabasica.app;
import java.util.Scanner;

public class TempoDeVidaCigarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cigarrosDia;
        int anosFumando;
        int totalCigarro;
        int minutosPerdidos;
        int diasPerdidos;

        System.out.println("Quantos cigarros você fuma por dia?");
        cigarrosDia = scanner.nextInt();
        System.out.println("Por quantos anos você já fumou?");
        anosFumando = scanner.nextInt();

        //Calcula o total de cigarros já fumados em todos so anos.
        totalCigarro = (cigarrosDia * 365) * anosFumando;

        //Calcula o tempo perdido em minutos, para cada cigarro 10 minutos.
        minutosPerdidos = totalCigarro * 10;

        //Calcula o tempo perdido em dias (considerando 24 horas em um dia e 60 minutos em uma hora tatalizando 1440 minutos por dia).
        diasPerdidos = minutosPerdidos/1440;

        //Imprime no cosole o valor do alugel do carro.
        System.out.println("Você perdeu aproximadamente " + diasPerdidos + " dias de vida devido ao cigarro.");

        scanner.close();

    }
}