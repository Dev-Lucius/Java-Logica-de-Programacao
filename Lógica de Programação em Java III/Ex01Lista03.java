// Ler um valor e escrever se é positivo, negativo ou zero

import java.util.Scanner;

public class Ex01Lista03{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("insira um Número: ");
        int numero = in.nextInt();

        if(numero > 0){
            System.out.println("Positivo");
        } else if(numero < 0){
            System.out.println("Negativo");
        } else {
            System.out.println("Inválido");
        }

        in.close();
    }
}