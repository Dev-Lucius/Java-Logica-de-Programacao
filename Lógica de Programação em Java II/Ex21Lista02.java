/*
A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros
que deverá colocar no tanque de seu carro para que ele possa percorrer um
determinado número de voltas até o primeiro reabastecimento. 

Escreva um algoritmo que leia o comprimento da pista (em metros), o número total de voltas a
serem percorridas no grande prêmio, o número de reabastecimentos desejados e o
consumo de combustível do carro (em Km/L). 

Calcular e escrever o número mínimo de litros necessários para percorrer até o primeiro reabastecimento. 

Observação: Considere que o número de voltas entre os reabastecimentos é o mesmo.
*/

import java.util.Scanner;

public class Ex21Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float comprimentoPista;
        float consumoCarro;
        int numTotalVoltas;
        int numAbastecimentosDesejados;

        System.out.println("Informe o Comprimento da Pista: ");
        comprimentoPista = in.nextFloat();

        System.out.println("Informe o consumo médio (Km/L) deste carro: ");
        consumoCarro = in.nextFloat();

        System.out.println("Informe, RESPECTIVAMENTE, o Total de Voltas eo Numero de Abastecimentos desejados pela equipe: ");
        numTotalVoltas = in.nextInt();
        numAbastecimentosDesejados = in.nextInt();

        int totalTrechos = numAbastecimentosDesejados + 1;
        double voltasPorTrechos = (double)(numTotalVoltas / totalTrechos);
        double comprimentoTotal = (voltasPorTrechos * comprimentoPista) / 1000;
        double litrosAtePrimeiroReabastecimento = comprimentoTotal / consumoCarro;

        System.out.println("Os litros necessários para percorrer até o Primeiro Reabastecimento é de " + litrosAtePrimeiroReabastecimento);
        in.close();
    }
}
