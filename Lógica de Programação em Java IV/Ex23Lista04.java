/*
Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material
radioativo. Sabendo-se que este perde 25% de sua massa a cada 30 segundos.
Escrever um algoritmo em Java que calcule iterativamente e imprima o tempo
necessário para que a massa deste material se torne menor que 0,10 grama.
*/

import java.util.Scanner;

public class Ex23Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double massa;
        int tempo = 0;

        System.out.println("Informe a massa do Material: ");
        massa = in.nextDouble();

        if(massa <=0 ){
            System.out.println("Erro");
        } else {
            while (massa >= 0.1) {
                // Conceito Matemático
                // M(t) = M0 * (0.75)^n
                // n = número de ciclos de 30 segundos
                // tempo = 30 × n
                massa = massa * 0.75;
                tempo = tempo + 30;
            }
        }

        // Convertendo para Dias
        double dias = tempo / 86400.0;

        System.out.printf("Foram necessários %.6f dias\n", dias);
        System.out.printf("Massa Final %.4fg\n", massa);

        in.close();
    }
}
