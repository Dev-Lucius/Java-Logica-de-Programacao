/* 
Escreva um programa em JAVA para calcular a média de valores PARES e
ÍMPARES, que serão digitados pelo usuário. 

Ao final o algoritmo deve mostrar estas duas médias. O algoritmo deve mostrar também o maior número PAR digitado e o
menor número ÍMPAR digitado. 

Para finalizar o usuário irá digitar um valor negativo.
*/

import java.util.Scanner;

public class Ex21Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;
        int maiorPar = 0;
        int menorImpar = 9999;

        double mediaPares = 0;
        double somaPares = 0;
        int qtdPares = 0;

        double mediaImpares = 0;
        double somaImpares = 0;
        int qtdImpares = 0;

        while(true){
            System.out.println("Informe um Número: ");
            numero = in.nextInt();

            if(numero < 0){
                break;
            }

            // Tratando os Pares
            if(numero % 2 == 0) {
                qtdPares++;
                somaPares += numero;

                if(numero > maiorPar){
                    maiorPar = numero;
                }
            }

            // Tratando os Impares
            if(numero % 2 != 0) {
                qtdImpares++;
                somaImpares += numero;

                if(numero < menorImpar){
                    menorImpar = numero;
                }
            }
        }

        mediaPares = somaPares / qtdPares;
        mediaImpares = somaImpares / qtdImpares;

        System.out.println(" === RESULTADOS === ");
        System.out.printf("Média Pares: %.2f\n", mediaPares);
        System.out.printf("Média Impares: %.2f\n", mediaImpares);
        System.out.println("Maior Par: " + maiorPar);
        System.out.println("Menor Impar: " + menorImpar);

        in.close();
    }
}
