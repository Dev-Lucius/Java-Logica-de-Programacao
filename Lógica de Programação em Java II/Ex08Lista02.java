// Escreva um algoritmo para ler o número total de eleitores de um município, o
// número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
// cada um representa em relação ao total de eleitores

import java.util.Scanner;

public class Ex08Lista02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float totalEleitores, votosBrancos, votosNulos, votosValidos;
        double percentualBranco, percentualNulo, percentualValido;

        System.out.println("Insira o número de votos Brancos, Nulos e Válidos, respectivamente: ");
        votosBrancos = in.nextFloat();
        votosNulos = in.nextFloat();
        votosValidos = in.nextFloat();

        totalEleitores = votosBrancos + votosNulos + votosValidos;

        percentualBranco = (votosBrancos / totalEleitores) * 100;
        percentualNulo = (votosNulos / totalEleitores) * 100;
        percentualValido = (votosValidos / totalEleitores) * 100;

        System.out.println("RESULTADOS");
        System.out.printf("O Percentual de votos brancos é: %.2f\n", percentualBranco);
        System.out.printf("O Percentual de votos Nulos é: %.2f\n", percentualNulo);
        System.out.printf("O Percentual de votos Válidos é: %.2f\n", percentualValido);

        in.close();
    }
}
