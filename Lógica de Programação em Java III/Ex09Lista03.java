/*
Escreva um algoritmo que leia as notas das duas avaliações normais e a nota da
avaliação optativa. Caso o aluno não tenha feito a optativa deve ser fornecido o valor
–1. 

Calcular a média do semestre considerando que a prova optativa substitui a nota
mais baixa entre as duas primeiras avaliações. 

Escrever a média e mensagens que
indiquem se o aluno foi aprovado, reprovado ou está em exame, de acordo com as
informações abaixo:
    Aprovado : media >= 6.0
    Reprovado: media < 3.0
    Exame : media >= 3.0 e < 6.0
*/

import java.util.Scanner;

public class Ex09Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nota1, nota2;
        double media = 0.0;
        int optativa;
        String situacao = "";

        System.out.println("Insira as Notas das Duas Avaliações de um Aluno: ");
        nota1 = in.nextInt();
        nota2 = in.nextInt();

        // Atualizando a Nota Optativa;
        System.out.println("Você fez a prova Optativa? ");
        System.out.println("-1 => Se não Fez;");
        optativa = in.nextInt();

        if(optativa == -1){
            media = (nota1 + nota2) / 2;
        } else {

            // Optativa Substituindo a Menor Nota
            int menor = Math.min(nota1, nota2);
            int maior = Math.max(nota1, nota2);
            
            if(optativa > menor){
                menor = optativa;
            }

            media = (maior + menor) / 2;
        }
        
        if(media >= 6){
            situacao = "Aprovado";
        } else if(media >= 3 && media < 6){
            situacao = "Exame";
        } else {
            situacao = "Reprovado";
        }

        System.out.println("Sua média é de: " + media);
        System.out.println("Situação: " + situacao);
        in.close();
    }
}
