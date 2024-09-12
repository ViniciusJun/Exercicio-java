package com.sequenciabasica.app;
import java.util.Scanner;;

public class CalculadoraDistancias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metros = 0.0;

        System.out.println("Digite uma distância em metros, usando vírgula:");
        metros = scanner.nextDouble();

        //Àrea dos calculos de medidas
        double kilometro = metros/1000;
        double hectometro = metros/100;
        double decametro = metros/10;
        double decimetro = metros*10;
        double centimetro = metros*100;
        double milimetros = metros*1000;

        //Printa na tela todos os calculos
        System.out.println("A distância de " + metros + "m corresponde a: ");
        System.out.println(kilometro + " km");
        System.out.println(hectometro + " hm");
        System.out.println(decametro + " dam");
        System.out.println(decimetro + " dm");
        System.out.println(centimetro + " cm");
        System.out.println(milimetros + " mm");

        scanner.close();
    }
    
}
