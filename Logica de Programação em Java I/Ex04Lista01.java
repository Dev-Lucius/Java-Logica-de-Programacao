// Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
// variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do
// triângulo.
import java.util.Scanner;

public class Ex04Lista01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int base, altura;

        System.out.println("Informe, respectivamente, a base e a altura do Triângulo: ");
        base = in.nextInt();
        altura = in.nextInt();

        double area = (base * altura) / 2.0;
        System.out.println("A área do triângulo é igual a: " + area);
        in.close();
    }
}
