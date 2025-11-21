// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
// positivo).

import java.util.Scanner;

public class Ex03Lista02 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int valor;

        System.out.println("Insira um valor: ");
        valor = in.nextInt();

        if(valor > 0){
            System.out.println("Valor é Positivo");
        } else if(valor < 0) {
            System.out.println("Valor é Negativo");
        } else {
            System.out.println("Valor é Igual a Zero");
        }

        in.close();
    }
}
