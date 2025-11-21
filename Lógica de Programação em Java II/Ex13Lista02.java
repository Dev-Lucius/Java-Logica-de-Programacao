// Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
// simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
// (considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
// a média calculada.

import java.util.Scanner;

public class Ex13Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota1, nota2;
        int media;

        System.out.println("Informe a Nota da 1° e da 2° Prova do Aluno: ");
        nota1 = in.nextInt();
        nota2 = in.nextInt();

        media = (nota1 + nota2) / 2;

        if(media >= 6){
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        in.close();
    }
}
