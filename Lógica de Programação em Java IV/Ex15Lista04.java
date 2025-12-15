/*
Fazer um algoritmo que leia um número inteiro e escreva se ele é ou não um
número primo. Um número é primo quando ele é divisível somente por um e por ele
mesmo. Você utilizará uma combinação entre os comandos while e if
*/

import java.util.Scanner;

public class Ex15Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int countDiv = 0;

        System.out.println("Insira um Número");
        num = in.nextInt();

        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                countDiv++;
            }
        }

        if(countDiv == 2){
            System.out.println(num + " é Primo");
        } else{
            System.out.println(num + " Não é Primo");
        }
        in.close();
    }
}
