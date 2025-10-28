// Desenvolva o algoritmo de um programa onde o usuário irá informar um número
// inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
// número digitado pelo usuário.
import java.util.Scanner;

public class Ex01Lista01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = in.nextInt();

        int antecessor = n - 1;
        System.out.println("O Antecessor de número " + n + " é: " + antecessor);
        in.close();
    }
}