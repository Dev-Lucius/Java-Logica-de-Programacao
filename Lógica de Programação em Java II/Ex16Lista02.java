/*
Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
concedido. Nenhum dos valores informados pode ser zero ou negativo.
*/

import java.util.Scanner;

public class Ex16Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double salario, emprestimo;
        int nPrestacoes;

        System.out.println("Informe, RESPECTIVAMENTE, o valor do salário, do empréstimo e o Num° de Prestações: ");
        salario = in.nextDouble();
        emprestimo = in.nextDouble();
        nPrestacoes = in.nextInt();

        if(salario <= 0 || emprestimo <= 0 || nPrestacoes <= 0){
            System.out.println("Valores inválidos");
        } else {
            double prestacao = emprestimo / nPrestacoes;

            if((prestacao/salario) > 0.3){
                System.out.println("O valor da prestação ultrapassou o Limite de 30%");
            } else {
                System.out.println("O Empréstimo pode ser concedido no valor de: R$" + prestacao);
            }
        }

        in.close();
    }
}
