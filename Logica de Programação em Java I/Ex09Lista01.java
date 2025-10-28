// Considere que você deseja uma comemoração especial para o seu aniversário e
// assim irá convidar familiares a amigos para um churrasco na sua residência. 

// Você irá precisar comprar a carne a ser consumida pelos seus convidados, logo precisa
// de uma forma de calcular a quantidade certa a ser adquirida.

// Desenvolva o algoritmo do programa para auxiliar no cálculo da quantidade de carne
// bovina (sem osso) a ser comprada considerando que homens, mulheres e crianças
// consomem uma quantidades diferentes de carne.

// Consumo de carne médio
// (http://www.embaixadordochurrasco.com.br/calculochurrasco):

// Homens: 400 gramas
// Mulheres: 320 gramas
// Crianças: 200 gramas

// *Observação: geralmente é adicionada uma margem de segurança na quantidade
// de carne a ser comprada para evitar que falte. Adicione uma margem de segurança
// de 20% no total de carne a ser adquirida.

import java.util.Scanner;

public class Ex09Lista01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int qtdHomens, qtdMulheres, qtdCriancas;
        double qtdCarne; 
        final float margemSeguranca = 1.2f;

        System.out.println("Informe, respectivamente, a quantidade de homens, mulheres e crianças que irão ao churrasco: ");
        qtdHomens = in.nextInt();
        qtdMulheres = in.nextInt();
        qtdCriancas = in.nextInt();
        
        qtdCarne = (int) ((qtdHomens * 400) + (qtdMulheres * 320) + (qtdCriancas * 200) * margemSeguranca);
        System.out.printf("Será necessária a compra de %.2f kg de carne bovina para o churrasco.%n", qtdCarne / 1000);
        in.close();
    }
}
