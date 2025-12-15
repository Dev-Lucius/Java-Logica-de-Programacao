/*
Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor
lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após
a leitura do valor, escrever o valor lido na tela.
*/

import java.util.Scanner;

public class Ex06Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;

        while (true) { 
            System.out.println("Informe um Valor: ");
            valor = in.nextInt();

            if(valor < 1 || valor > 10){
                System.out.println("Inválido. Tente Novamente");
            } else {
                System.out.println("Valor Válido!");
                break;
            }
        }

        System.out.println("Encerrando...");
        in.close();
    }
}
