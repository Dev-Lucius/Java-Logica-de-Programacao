/*
Faça um programa que, para um número indeterminado de pessoas: leia a idade de
cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
considerada. 

A seguir calcule:
    • o número de pessoas;
    • a idade média do grupo;
    • a menor idade e a maior idade.
*/

import java.util.Scanner;

public class Ex18Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;
        int i = 0;
        int menorIdade = 9999;
        int maiorIdade = 0;

        double idadeMedia = 0;
        double somaIdade = 0;

        while (true) {
            System.out.println("Informe a Idade Desta Pessoa: ");
            idade = in.nextInt();
            
            if(idade > 0){
                i++;
                somaIdade += idade;

                if(idade > maiorIdade){
                    maiorIdade = idade;
                }

                if(idade < menorIdade){
                    menorIdade = idade;
                }

            } else {
                idadeMedia = somaIdade / i;
                break;
            }
        }

        System.out.println("Resultados");
        System.out.println("Quantidade de Pessoas: " + i);
        System.out.println("Média de Idades: " + idadeMedia);
        System.out.println("Maior Idade: " + maiorIdade);
        System.out.println("Menor Idade: " + menorIdade);
    }
}
