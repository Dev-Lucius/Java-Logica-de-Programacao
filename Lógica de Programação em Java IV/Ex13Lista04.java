/*
Faça um programa que receba 3 notas de um aluno, e escolha apenas as duas
maiores notas para o cálculo da média. Apresente a média final, entre as duas
maiores notas. Dica: utilize 3 comandos if.
*/

import java.util.Scanner;

public class Ex13Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota1, nota2, nota3;
        double soma = 0, media = 0;
        double menor;

        System.out.println("Insira o valor da Primeira Nota: ");
        nota1 = in.nextDouble();

        System.out.println("Insira o valor da Segunda Nota: ");
        nota2 = in.nextDouble();

        System.out.println("Insira o valor da Terceira Nota: ");
        nota3 = in.nextDouble();

        // Fazendo um Pré Cálculo das três Notas
        soma = nota1 + nota2 + nota3;

        // Assumindo que a Nota1 É a menor
        // Iremos comparar todas as Notas com a "menor" (que é igual a nota1)
        // Para atualizar o valor da Menor
        menor = nota1;
        if(nota2 < menor){
            menor = nota2;
        }

        if(nota3 < menor){
            menor = nota3;
        }

        // Retirando a Menor da Soma
        soma = soma - menor;
        media = soma / 2;

        System.out.printf("Média Final = %.2f\n", media);
        in.close();
    }
}
