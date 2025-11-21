// Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
// que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
// em que a pessoa nasceu).

import java.util.Scanner;

public class Ex14Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int anoAtual = 2025;
        int anoNascimento;

        System.out.println("Informe o ano do seu Nascimento: ");
        anoNascimento = in.nextInt();

        if((anoAtual - anoNascimento) >= 18){
            System.out.println("Pode Votar!");
        } else {
            System.out.println("Não pode Votar");
        }

        in.close();
    }
}
