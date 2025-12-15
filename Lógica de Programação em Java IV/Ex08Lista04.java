/*
Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
um algoritmo que permita a entrada das seguintes informações:

    a) o número total de mercadorias no estoque
    b) o valor de cada mercadoria.

Ao final imprimir o valor total em estoque e a média dos valores das mercadoria
*/

import java.util.Scanner;

public class Ex08Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Variáveis de Armazenamento
        int numMercadoriaEstoque;
        int valorPerMercadoria;
        char cadastrar;

        // Variáveis De Cálculo
        double valorTotal = 0.00;
        double somatorio = 0.00;
        double medias = 0.00;

        System.out.println("Levantamento de Estoque: ");
        int i = 0;
        while (true) {
            System.out.println("Deseja Cadastrar uma Mercadoria? ");
            System.out.println("s / n");
            cadastrar = in.next().charAt(0);

            if(cadastrar == 's'){
                i++;
                System.out.println("Informe a Quantidade em Estoque e o Valor por Unidade, da Mercadoria N°" + i);
                numMercadoriaEstoque = in.nextInt();
                valorPerMercadoria = in.nextInt();
                valorTotal = Math.ceil(numMercadoriaEstoque * valorPerMercadoria);
                somatorio = somatorio + valorTotal;
            } else if(cadastrar == 'n'){
                System.out.println("Levantamento Concluído...");
                break;
            }
        }

        medias = Math.ceil(somatorio / i);
        System.out.printf("O Valor Total em Estoque: R$ %.2f\n", somatorio);
        System.out.printf("A Média dos Valores: R$ %.2f\n", medias);
        in.close();
    }
}
