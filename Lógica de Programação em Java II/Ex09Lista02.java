// Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
// mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692

import java.util.Scanner;

public class Ex09Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira o valor do Raio de um circunferência: ");
        float raio = in.nextFloat();

        // Constante pi
        final double pi = 3.141692;
        // Cálculo do Diâmetro
        float diametro = 2 * raio;

        double comprimento = (2 * pi * raio);
        double area = pi * (Math.pow(raio, 2));

        System.out.println("RESULTADOS");
        System.out.printf("Comprimento: %.3f\n", comprimento);
        System.out.printf("Área: %.3f\n", area);
        System.out.printf("Diâmetro: %.3f\n", diametro);
        in.close();
    }
}
