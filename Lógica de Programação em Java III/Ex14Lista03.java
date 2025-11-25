/*
Faça um programa que receba os valores de 3 notas de um aluno e apresenta um
conceito baseado na tabela abaixo:

*/

import java.util.Scanner;

public class Ex14Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota1, nota2, nota3;
        String conceito = "";

        System.out.println("Insira três notas de um Aluno: ");
        nota1 = in.nextInt();
        nota2 = in.nextInt();
        nota3 = in.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 9.0){
            conceito = "A";
        } else if(media >= 7.5 && media < 9.0){
            conceito = "B";
        } else if(media >= 6.0 && media < 7.5){
            conceito = "C";
        } else {
            conceito = "D";
        }

        System.out.printf("Média Final: %.2f\n", media);
        System.out.println("Conceito: " + conceito);
        in.close();
    }
}
