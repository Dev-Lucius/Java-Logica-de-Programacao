/*
Escreva um algoritmo para ler 2 valores e, se o segundo valor informado for ZERO,
deve ser lido um novo valor, ou seja, para o segundo valor lido não pode ser aceito o
valor zero. Após ler os 2 valores, imprimir o resultado da divisão do primeiro valor
lido pelo segundo valor lido.
*/

import java.util.Scanner;

public class Ex11Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2;

        while (true) { 
            System.out.println("Informe dois Valores: ");
            valor1 = in.nextInt();
            valor2 = in.nextInt();

            if(valor2 == 0){
                System.out.println("Valor Inválido: ");
                System.out.println("Informe Outro Valor...");
            } else {
                System.out.println("Valores Válidos");
                break;
            }
        }
        System.out.println("Divisão: " + (valor1 / valor2));
        in.close();
    }
}
