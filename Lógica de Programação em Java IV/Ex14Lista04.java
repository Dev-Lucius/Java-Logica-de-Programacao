/*
Ler 10 valores e escrever quantos desses valores lidos estão compreendidos entre o
intervalo de 1 até 10. Mostre a multiplicação entre valores digitados no intervalo de 0
e 10, e a soma dos valores fora deste intervalo.
*/

import java.util.Scanner;

public class Ex14Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        int countIntervalo = 0;
        double multiplicacao = 1;
        double soma = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Insira um Número: ");
            num = in.nextInt();

            // Cotando Quantos Estão entre 1 e 10
            if(num >= 1 && num <= 10){
                countIntervalo++;
            }

            // Multiplicação dos Valores dentro do Intervalo
            if(num >= 1 || num <= 10){
                multiplicacao = multiplicacao * num;
            } else{
                // Soma dos Valores Fora do Intervalo
                soma = soma + num;
            }
        }

        System.out.println("Quantidade de Valores Dentro do Intervalo = " + countIntervalo);
        System.out.printf("Multiplicação = %.2f\n", multiplicacao);
        System.out.println("Soma = " + soma);
        in.close();
    }
}
