/*
Faça um programa que receba a 5 notas de um aluno, através do comando while, e
que apresente ao final a média dessas 5 notas. Você deverá ter apenas uma
variável nota, e uma variável média.
*/

import java.util.Scanner;

public class Ex05Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float nota;
        double media = 0.00;

        int i = 0;
        while(i < 5){
            i++;
            System.out.println("Informe a Nota de um Aluno: ");
            nota = in.nextFloat();
            media = media + nota;
        }

        media = (int)(media / i);
        System.out.println("A média: " + media);
        in.close();
    }
}
