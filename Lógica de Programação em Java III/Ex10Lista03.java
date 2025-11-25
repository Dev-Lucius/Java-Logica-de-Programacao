/*
Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
2:masculino) de uma pessoa, construa um algoritmo que calcule e imprima seu peso
ideal, utilizando as seguintes fórmulas:
- para homens : (72.7 * h) – 58
- para mulheres : (62.1 * h) – 44.7
Observação: Altura = h (na fórmula acima).
*/

import java.util.Scanner;

public class Ex10Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sexo;
        float altura;
        double pesoIdeal = 0.0;

        System.out.println("Informe sua Altura: ");
        altura = in.nextFloat();

        System.out.println("Informe seu Sexo: ");
        System.out.println("1 => Feminino");
        System.out.println("2 => Masculino");
        sexo = in.nextInt();

        if(sexo == 1){
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if(sexo == 2){
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            System.out.println("Numero Inválido");
        }

        System.out.printf("Seu peso Ideal é de: %.2f\n", pesoIdeal);
        in.close();
    }
}
