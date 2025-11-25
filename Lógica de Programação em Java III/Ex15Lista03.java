/*
Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das
variáveis: Experimente implementar o mesmo algoritmo em JAVA e verificar se seu teste de
mesa foi correto.
*/

import java.util.Scanner;

public class Ex15Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a, b, c;
        String mensagem;

        System.out.println("Insira os Lados de um Triângulo: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        if((b+c > a) && (a+c > b) && (a+b > c)){
            // É um Triângulo
            if((a == b) && (b == c)){
                mensagem = "Triângulo Equilátero";
            } else if((a == b) || (b == c) || (c == a)){
                mensagem = "Triângulo Isósceles";
            } else {
                mensagem = "Triângulo Escaleno";
            }
        } else {
            mensagem = "Não é um Triângulo";
        }

        System.out.println(mensagem);
        in.close();

        // Testes de Mesa
        /*

        -------------------------------------------------
        |   a   |   b   |   c   |      mensagem         |
        -------------------------------------------------
        |   1   |   2   |   3   | Não é um Triângulo    |
        |   3   |   4   |   5   | Triângulo Escaleno    |
        |   2   |   2   |   4   | Não é um Triângulo    |
        |   4   |   4   |   4   | Triângulo Equilátero  |
        |   5   |   3   |   3   | Triângulo Isósceles   |
        -------------------------------------------------
        
        */


    }
}
