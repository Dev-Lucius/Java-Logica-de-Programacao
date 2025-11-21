// Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
// e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
// dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.

import java.util.Scanner;

public class Ex06Lista02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int idadeAnos, idadeMeses, idadeDias, totalDias;

        System.out.println("Insira a sua idade em anos: ");
        idadeAnos = in.nextInt();

        System.out.println("Insira a sua idade em meses: ");
        idadeMeses = in.nextInt();

        System.out.println("Insira a sua idade em Dias: ");
        idadeDias = in.nextInt();

        totalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        System.out.println("Sua Idade em Dias é: " + totalDias + " dias");
        in.close();
    }
}
