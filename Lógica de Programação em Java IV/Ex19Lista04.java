/*
Faça um programa que mostre n primeiros valores da sequência de Fibonacci, a
sequência é feita da seguinte maneira: 1 1 2 3 5 8 13 21 34 55 ...
*/

import java.util.Scanner;

public class Ex19Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = 1;
        int num2 = 1;

        int nextNum;
        int n;

        System.out.println("Informe os N valores da Sequência de Fibonacci: ");
        n = in.nextInt();

        if(n >= 1){
            System.out.print(num1 + " ");
        }

        if(n >= 2){
            System.out.print(num2 + " ");
        }

        // Começamos o Laço pelo Terceiro Termo
        for(int i = 3; i <= n; i++){
            // O próximo Termo da Sequência é - > próximo = anterior1 + anterior2
            nextNum = num1 + num2;
            System.out.print(nextNum + " ");

            num1 = num2;
            num2 = nextNum;
        }

        in.close();
    }
}
