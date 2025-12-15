// Ler um número inteiro n. Escrever a soma de todos os números de 1 até n

import java.util.Scanner;

public class Ex01Lista04{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n;
        int sum = 0;

        System.out.println("Informe um Inteiro Aleatório: ");
        n = in.nextInt();

        // Ex
        // n = 5
        // sum = 0 + 1 + 2 + 3 + 4 + 5 
        // sum = 15
        for(int i = 0; i <= n; i++){
            sum = sum + i;
        }

        System.out.println("Soma: " + sum);
        in.close();
    }
}