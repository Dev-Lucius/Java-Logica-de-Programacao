// Ler um número inteiro n. Decidir se n é um número primo e apresente o resultado

import java.util.Scanner;

public class Ex03Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe um Inteiro Aleatório: ");
        int n = in.nextInt();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                sum = sum + 1;
            }
        }

        if(sum == 2){
            System.out.println(n + " é um Primo!");
        } else {
            System.out.println(n + " Não é um Primo!");
        }

        in.close();
    }
}
