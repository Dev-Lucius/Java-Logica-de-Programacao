/*
Receba um número inteiro positivo, e o seu respectivo expoente inteiro positivo, e
apresente o resultado da potência deste número. Faça isso utilizando o comando
while. Tenha cuidado com as inicializações!
*/

import java.util.Scanner;

public class Ex16Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int expoente;
        int potencia = 1;

        System.out.println("Informe, Respectivamente, um Número e o seu Expoente: ");
        num = in.nextInt();
        expoente = in.nextInt();

        // num = 2, expoente = 2
        // potencia = num * potencia (enquanto o i - expoente - continuar sendo incrementado)
        for(int i = 0; i < expoente; i++){
            potencia = potencia * num;
        }
        System.out.println("Potência = " + potencia);
        in.close();
    }
}
