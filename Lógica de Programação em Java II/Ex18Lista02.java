// Uma revendedora de carros usados paga a seus funcionários vendedores um salário
// fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
// carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
// recebe por carro vendido. Calcule e escreva o salário final do vendedor.

import java.util.Scanner;

public class Ex18Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salarioFixo;
        float comissaoValor;
        float carroVendidos;
        double salarioTotal, comissao;

        System.out.println("Insira o salário Fixo deste Funcionário: ");
        salarioFixo = in.nextFloat();

        System.out.println("Informe o Valor da Comissão e o Numero de Carros VCndidos: ");
        comissaoValor = in.nextFloat();
        carroVendidos = in.nextInt();
        comissao = (comissaoValor * carroVendidos);

        salarioTotal = salarioFixo + comissao;

        System.out.printf("O salário total será de: \n%.2f", salarioTotal);
        in.close();
    }
}
