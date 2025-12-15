/*
Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. 
Idade válida tem que ser maior que 0 e menor que 150. Escrever a idade lida.
*/

import java.util.Scanner;

public class Ex09Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int idade;

        while (true) { 
            System.out.println("Informe a sua Idade: ");
            idade = in.nextInt();

            if(idade > 0 && idade < 150){
                System.out.println("Idade Válida!");
                break;
            } else {
                System.out.println("Idade Inválida, Tente Novamente");
            }
        }

        System.out.println("Encerrando...");
    }
}
