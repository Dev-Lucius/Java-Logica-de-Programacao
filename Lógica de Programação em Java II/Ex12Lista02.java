// As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
// 1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
// de maçãs compradas, calcule e escreva o custo total da compra.

import java.util.Scanner;

public class Ex12Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double precoMaca = 0;
        int qtdMacas;

        System.out.println("Informe a quantidade de Maças que serão Compradas: ");
        qtdMacas = in.nextInt();

        if(qtdMacas < 12){
            precoMaca = 1.50;
            System.out.println("O preço da Maça será de: " + precoMaca);
        } else {
            precoMaca = 1.30;
            System.out.println("O preço da Maça será de: " + precoMaca);
        }

        in.close();
    }
}
