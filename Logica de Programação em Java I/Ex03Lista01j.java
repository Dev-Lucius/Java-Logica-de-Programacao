// Desenvolva o algoritmo de um programa onde o usuário irá informar um número
// inteiro e o programa deve calcular e exibir quadrado do número informado pelo
// usuário.
import java.util.Scanner;

public class Ex03Lista01j {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número Inteiro: ");
        int n = in.nextInt();

        int quadrado = n * n;
        System.out.println("O quadrado de " + n + " é igual a " + quadrado);
        in.close();
    }
}
