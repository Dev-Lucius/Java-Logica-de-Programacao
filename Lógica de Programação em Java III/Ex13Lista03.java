/*
Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida e
o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço
unitário), o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se
que:
    - Se quantidade <= 5 o desconto será de 2%
    - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
    - Se quantidade > 10 o desconto será de 5
*/

import java.util.Scanner;

public class Ex13Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        float qtdAdquirida;
        float precoUnitario;
        double desconto;
        double total;

        System.out.println("Informe a Descrição do Produto: ");
        nome = in.next();

        System.out.println("Informe, RESPECTIVAMENTE, a Quantidade Adquirida e o Preço Unitário: ");
        qtdAdquirida = in.nextFloat();
        precoUnitario = in.nextFloat();

        if(qtdAdquirida <=5 ){
            desconto = 0.98;
        } else if(qtdAdquirida > 5 && qtdAdquirida <= 10){
            desconto = 0.97;
        } else {
            desconto = 0.95;
        }

        total = (qtdAdquirida * precoUnitario) * desconto;
        System.out.println("Resultados");
        System.out.print("Descontos: " + (desconto * 100) + "%");
        System.out.printf("Valor Total: %.2f\n", total);
        in.close();
    }
}
