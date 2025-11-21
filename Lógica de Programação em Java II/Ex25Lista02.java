/*
Faça um programa que leia o valor de um produto X e leia a quantidade de reais de
um cofrinho que contenha:
    ♦ N moedas de 1 real;
    ♦ N moedas de 50 centavos;
    ♦ N moedas de 25 centavos;
    ♦ N moedas de 10 centavos;
    ♦ N moedas de 5 centavos;
O programa deverá verificar se o total de reais que contém no cofrinho é o bastante
para a compra o produto X.
*/

import java.util.Scanner;

public class Ex25Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorProduto;
        int moedasUm, moedasCinq, moedasVinteCinco, moedasDez, moedasCinco;

        System.out.println("Informe o valor de um Produto X: ");
        valorProduto = in.nextDouble();

        System.out.println("Informe a quantidade de Moedas de 1 Real, 50 Centavos, 25 Centavos, 10 Centavos e 5 Centavos Respectivamente: ");
        moedasUm = in.nextInt();
        moedasCinq = in.nextInt();
        moedasVinteCinco = in.nextInt();
        moedasDez = in.nextInt();
        moedasCinco = in.nextInt();

        double somaTotal = moedasUm + (moedasCinq * 0.5) + (moedasVinteCinco * 0.25) + (moedasDez * 0.1) + (moedasCinco * 0.05);


        System.out.println("\n ----Resultados ----");
        System.out.printf("Preço do Produto X: R$ %.2f\n", valorProduto);
        System.out.printf("Total de Reais no Cofrinho X: R$ %.2f\n", somaTotal);
        if(somaTotal >= valorProduto){
            System.out.println("Compra é Possível");
        } else {
            System.out.println("Compra Não é Possível");
        }

        in.close();
    }
}
