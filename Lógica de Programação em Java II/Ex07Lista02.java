// Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
// e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
// referido mês e qual será seu salário atual. Calcule também o salário líquido
// (desconto de impostos) considerando 15% de impostos e mostre esses valores.
//      a. Pergunte ao usuário qual a % de imposto que é descontada do salário.

import java.util.Scanner;

public class Ex07Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float salarioPorHora;
        int horasTrabalhadas;
        float salarioBruto, salarioLiquido;
        float percentualImposto;

        System.out.println("Quanto você ganha por hora?");
        salarioPorHora = in.nextFloat();

        System.out.println("Quantas horas você trabalhou no mês?");
        horasTrabalhadas = in.nextInt();

        System.out.println("Qual a porcentagem de imposto que é descontada do seu salário?");
        percentualImposto = in.nextFloat();

        salarioBruto = salarioPorHora * horasTrabalhadas;
        salarioLiquido = salarioBruto - (salarioBruto * percentualImposto / 100);

        System.out.println("Seu salário bruto é: " + salarioBruto);
        System.out.println("Seu salário líquido é: " + salarioLiquido);

        in.close();
    }
}
