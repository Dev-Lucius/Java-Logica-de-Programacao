/*
Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta
que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O
algoritmo deve também contar quantas vezes o usuário tentou digitar a senha
correta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa
informação na tela.
*/

import java.util.Scanner;

public class Ex07Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int senha = 12345;
        int senhaTent;
        int tentativas = 0;

        System.out.println("Bem Vindo!");
        while (true) { 
            System.out.println("Informe sua Senha: ");
            senhaTent = in.nextInt();
            tentativas++;

            if(senhaTent == senha){
                System.out.println("Senha Correta!");
                System.out.println("Foram Necessárias " + tentativas + " Tentativa"); // 1
                break;
            } else {
                System.out.println("Senha Incorreta;");
                System.out.println("Tente Novamente...");
            }
        }
    }
}
