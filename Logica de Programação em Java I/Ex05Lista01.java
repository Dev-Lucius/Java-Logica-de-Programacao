// Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
// graus Celsius.
import java.util.Scanner;

public class Ex05Lista01 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Informe a temperatura em Escala Fahrenheit: ");
        double fahrenheit = in.nextDouble();

        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.println("A temperatura em Celsius é igual a: "+ celsius);
        in.close();
    }
}
