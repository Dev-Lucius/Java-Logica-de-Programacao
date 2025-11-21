/*
Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4.599, escreva um algoritmo para
ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
o número de litros de combustível gasto e o valor total (R$) recebido dos
passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
do dia.
*/
import java.util.Scanner;

public class Ex20Lista02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        final double precoCombustivel = 4.599;
        float quilometragemInicial, quilometragemFinal, quilometragemTotal;
        float comsbustivelGasto;
        double arrecadacaoTotal;

        double consumo, lucroLiquido;

        System.out.println("Informe a marcação do Odômetro do Início e do Final do dia: ");
        quilometragemInicial = in.nextFloat();
        quilometragemFinal = in.nextFloat();
        quilometragemTotal = quilometragemFinal - quilometragemInicial;

        System.out.println("Informe o Combustível Gasto em Litros: ");
        comsbustivelGasto = in.nextFloat();

        System.out.println("Informe o Valor total Arrecadado dos Passageiros: ");
        arrecadacaoTotal = in.nextFloat();

        double gastoGasolina = quilometragemTotal * precoCombustivel;

        consumo = quilometragemTotal / comsbustivelGasto;
        lucroLiquido = arrecadacaoTotal - gastoGasolina;

        System.out.println("RESULTADOS");
        System.out.printf("Consumo: \n%.2f", consumo);
        System.out.printf("Lucro Liquido: \n%.2f", lucroLiquido);
        in.close();
    }
}
