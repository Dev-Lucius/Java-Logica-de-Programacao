// Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
// eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
// mensagem de erro

import java.util.Scanner;

public class Ex05Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double dividendo, divisor;

        System.out.println("Insira, respectivamente, o dividendo e o divisor de uma operação de divisão: ");
        dividendo = in.nextDouble();    
        divisor = in.nextDouble();
        
        if(divisor == 0){
            System.out.println("ERROR. Ímpossível dividir por Zero!");
        } else {
            System.out.printf("O resultado da divisão é: %.2f%n", (dividendo / divisor));
        }

        in.close();
    }
}
