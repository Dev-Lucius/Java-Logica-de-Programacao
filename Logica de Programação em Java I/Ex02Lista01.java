// O algoritmo deve ter como entrada um número real e a saída deve ser o valor
// atualizado com os 20%.
import java.util.Scanner;

public class Ex02Lista01{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma Número real: ");
        double n = in.nextInt();

        double atualizacao = n + (n * 0.2);

        System.out.println("A atualização de " + n + " é igual a: " + atualizacao);
        in.close();
    }
}