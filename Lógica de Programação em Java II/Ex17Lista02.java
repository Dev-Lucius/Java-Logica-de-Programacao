/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
custo final ao consumidor.
*/
import java.util.Scanner;

public class Ex17Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float custoFabrica;
        float percentualDistribuidor, impostos;
        double custoTotal;

        System.out.println("Informe o Custo de Fábrica de um Carro Novo: ");
        custoFabrica = in.nextFloat();

        percentualDistribuidor = (custoFabrica * 128) / 100;
        impostos = (custoFabrica * 145) / 100;

        custoTotal = Math.ceil(custoFabrica + percentualDistribuidor + impostos);
        System.out.println("O valor total será de: " + custoTotal);
        in.close();
    }
}
