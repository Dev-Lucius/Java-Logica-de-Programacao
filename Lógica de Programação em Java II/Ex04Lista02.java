// Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
// deles é o maior, imprimindo na resposta o nome da variável e o seu valor.

import java.util.Scanner;

public class Ex04Lista02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int valor1, valor2;

        System.out.println("Insira dois valores inteiros: ");
        valor1 = in.nextInt();
        valor2 = in.nextInt();

        if(valor1 > valor2){
            System.out.println(valor1 + " é o maior");
        } else if(valor2 > valor1){
            System.out.println(valor2 + " é o maior");
        } else {
            System.out.println("Os valores são iguais");
        }

        in.close();
    }
}
