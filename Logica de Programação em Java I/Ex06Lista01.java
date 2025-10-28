// Desenvolva o algoritmo de um programa para calcular a média de duas notas das
// avaliações de um aluno

import java.util.Scanner;

public class Ex06Lista01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira duas notas de um Aluno: ");
        double nota1 = in.nextDouble();
        double nota2 = in.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A média deste aluno é: " + media);
        in.close();
    }
}
