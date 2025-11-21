/*
Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
estoque e quantidade mínima em estoque de um produto. 

Calcular e escrever a quantidade média, usando a seguinte fórmula: ((quantidade média = quantidade
máxima + quantidade mínima)/2). 

Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem “Não efetuar compra”, senão escrever a
mensagem “Efetuar compra”.
*/
import java.util.Scanner;

public class Ex23Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe Respectivamente os seguintes dados de um Produto: ");
        System.out.println("Quantidade Atual, Quantidade Máxima, Quantidade Mínima: ");
        int quantidadeAtual = in.nextInt();
        int quantidadeMaxima = in.nextInt();
        int quantidadeMinima = in.nextInt();

        int quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2;

        if(quantidadeAtual >= quantidadeMedia){
            System.out.println("Não Efetuar Compra");
        } else {
            System.out.println("Efetuar Compra!");
        }

        in.close();
    }
}
