/*
Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do
salário para aceitar somente um “salário válido”. 

Você deve definir o que é um “salário válido”. Escrever o salário lido.

Salário Válido --> Positivo Maior que Zero AND Maior que um Salário Mínimo
*/

import java.util.Scanner;

public class Ex10Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final double salarioMinimo = 1500.00;
        double salario;

        while (true) { 
            System.out.println("Informe seu Salário: ");
            salario = in.nextDouble();

            if(salario > 0 && salario >= salarioMinimo){
                System.out.println("Salário Válido!");
                break;
            } else{
                System.out.println("Salário Informado é Inválido");
                System.out.println("Tente Novamente!");
            }
        }

        System.out.println("Encerrando...");
        in.close();
    }
}
