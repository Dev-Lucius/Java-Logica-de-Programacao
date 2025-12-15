/*
Escreva um programa que apresente quatro opções: 

    (a) consulta saldo; 
    (b) saque;
    (c) depósito;
    (d) sair.

O saldo deve iniciar em R$ 0,00. A cada saque ou depósito o
valor do saldo deve ser atualizado.

*/

import java.util.Scanner;

public class Ex04Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double saldo = 0.00;
        double valorSaque;
        double valorDeposito;
        char opcoes;

        while(true){
            System.out.println("Informe a Opção Desejada: ");
            System.out.println("a) Consulta Saldo: ");
            System.out.println("b) Saque");
            System.out.println("c) Depósito");
            System.out.println("d) Sair");
            opcoes = in.next().charAt(0);

            if(opcoes == 'd'){
                System.out.println("Saindo ...");
                break;
            }

            // Mostrando o Salto Atual
            if(opcoes == 'a'){
                System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
                System.out.println();
            }

            // Fazendo a Operação de Saque
            if(opcoes == 'b'){
                System.out.println("Informe o Valor de Saque: ");
                valorSaque = in.nextDouble();

                // Validando o Valor do Saque
                if(valorSaque > saldo){
                    System.out.println("Saldo é Insuficiente");
                    System.out.println();
                } else {
                    System.out.println("Seu Saque de R$" + valorSaque + " foi Aprovado");
                    saldo = saldo - valorSaque;
                    System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
                    System.out.println();
                }
            }

            // Fazendo a Operação de Depósito
            if(opcoes == 'c'){
                System.out.println("Informe o Valor de Depósito: ");
                valorDeposito = in.nextDouble();

                // Validando o Valor de Depósito
                if(valorDeposito <= 0){
                    System.out.println("Não Possível depositar Valores Negativos ou Iguais a 0");
                    System.out.println();
                } else {
                    saldo = saldo + valorDeposito;
                    System.out.println("Seu Depósito de R$" + valorDeposito + " foi Aprovado");
                    System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
                    System.out.println();
                }
            }
        }

        in.close();
    }
}
