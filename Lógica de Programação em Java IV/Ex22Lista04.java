/*
Dado um país A, com X habitantes e uma taxa de natalidade de 3% ao ano, e um
país B com Y habitantes e uma taxa de natalidade de 2% ao ano, escrever um
algoritmo em JAva que seja capaz de calcular e no fim imprimir o tempo necessário
para que a população do país A ultrapasse a população do país B. 

Considere que X < Y.
*/

import java.util.Scanner;

public class Ex22Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double popA;
        double popB;
        int tempo = 0;

        System.out.println("Informe a população do País A e do País B respectivamente: ");
        popA = in.nextDouble();
        popB = in.nextDouble();
        
        if (popA >= popB) {
            System.out.println("Deve-se considerar A maior do que B");
        } 
        
        else{
            // A ideia é simples...
            // A cada Ano:

            // Ano 1:
            // A = A * 1.03
            // B = B * 1.02
            // Ano 2:
            // A cresce sobre o valor já atualizado
            // B cresce sobre o valor já atualizado

            // Isso é crescimento exponencial composto.
            while (popA <= popB) {
                // Este problema usa:
                // P(t) = P0 * (1 + taxa)^t
                popA = popA * 1.03;
                popB = popB * 1.02;
                tempo++;
            }
        }

        // Estrutura Correta do System.out.printf]
        // System.out.printf("Texto %d outro texto %.2f", variavel1, variavel2);
        System.out.println("Foi preciso " + tempo + " anos para A ultrapassar B");
        System.out.printf("População de A após %d anos: %.2f\n", tempo, popA);
        System.out.printf("População de B após %d anos: %.2f\n", tempo, popB);

        in.close();
    }
}
