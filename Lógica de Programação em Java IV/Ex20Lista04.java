/* 
Escreva um programa que lê o tamanho do lado de um quadrado e imprime um
quadrado daquele tamanho com asteriscos. 

Seu programa deve funcionar para quadrados com lados de todos os tamanhos entre 1 e 20.
*/

import java.util.Scanner;

public class Ex20Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tamanho;

        System.out.println("Informe o Tamanho do Quadrado: ");
        tamanho = in.nextInt();

        if(tamanho < 1 || tamanho > 20){
            System.out.println("Tamanho Inválido");
        }

        // Lógica dos 2 for
        // for (linhas)
        //      for (colunas)
        //          imprime "*"
        for (int i = 0; i < tamanho; i++) { // Linhas
            for (int j = 0; j < tamanho; j++) { // Colunas
                System.out.print("*");
            }
            System.out.println();
        }
        
        in.close();
    }
}
