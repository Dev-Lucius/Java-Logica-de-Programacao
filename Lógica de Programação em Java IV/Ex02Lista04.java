// Ler um número inteiro n. Escrever a soma de todos os números pares de 2 até n.

import java.util.Scanner;

public class Ex02Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;
        int sumPares = 0;

        System.out.println("Informe um Inteiro Aleatório: ");
        n = in.nextInt();

        // n = 5
        // sum = 0 + 2 + 4
        // sum = 6
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 0){
                sumPares = sumPares + i;
            }
        }

        System.out.println("Soma de todos os pares: " + sumPares);
        in.close();
    }
}
