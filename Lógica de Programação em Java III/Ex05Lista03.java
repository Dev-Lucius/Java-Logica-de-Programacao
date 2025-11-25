// Ler três valores (A, B e C) representando as medidas dos lados de um triângulo e
// escrever se formam ou não um triângulo. Observação: para formar um triângulo, o
// valor de cada lado deve ser menor que a soma dos outros dois lados.

import java.util.Scanner;

public class Ex05Lista03{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;

        System.out.println("Insira os lados de um Triângulo: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if((a + b > c) && (b + c) > a && (a + c) > b){
            System.out.println("É um Triângulo");
        } else {
            System.out.println("Não é um Triângulo");
        }
    }
}