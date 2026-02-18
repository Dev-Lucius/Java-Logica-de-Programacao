/*
Desenvolva um programa em Java que determine o pagamento bruto de cada um de
vários empregados. 

A companhia paga o valor de uma "hora normal" pelas primeiras
40 horas trabalhadas de cada empregado e paga o valor de uma "hora extra" (uma
vez e meia a hora normal) para cada hora trabalhada depois de completadas as
primeiras 40 horas. 

Seu programa deve primeiramente receber a informação de
quantos empregados trabalharam durante a semana.

Em seguida, receba cada uma das informações acima descritas, para cada empregado, e mostre o pagamento
bruto para cada um deles. O valor da hora de cada empregado deve ser também
solicitado, pois pode ser diferente para cada empregado.
*/

import java.util.Scanner;

public class Ex17Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe a Quantidade de Empregados: ");
        int qtdEmpregados = in.nextInt();

        // Criando um Vetor para Armazenar o Salário Bruto de Cada empregado
        double[] salarios = new double[qtdEmpregados];
        
        // Criando um laço para ler os dados de cada emprego
        for (int i = 0; i < salarios.length; i++) {
            System.out.println("\nEmpregado " + (i + 1));

            System.out.println("Horas Trabalhadas na Semana: ");
            int horasTrabalhadas = in.nextInt();

            System.out.println("Valor da Hora Normal: ");
            double valorHoraNormal = in.nextDouble();

            double salario = 0;

            // Se trabalhou até 40 horas
            if(horasTrabalhadas <= 40){
                salario = horasTrabalhadas * valorHoraNormal;
            } 
            // Se houve a realização de Horas extras
            // Isto é, horasTrabalhadas > 40
            else{
                int horasExtras = horasTrabalhadas - 40;
                double valorHoraExtra = valorHoraNormal * 1.5;

                salario = (40 * valorHoraNormal) + (horasExtras * valorHoraExtra);
            }

            // Armazenando o Salário no Vetor
            salarios[i] = salario;
        }

        // Exibindo os Salários
        System.out.println("\n Pagamento Bruto os Empregados");
        for (int i = 0; i < salarios.length; i++) {
            // %d -> %d → inteiro (decimal) 
            // %f → número decimal (double)
            // .2  → duas casas decimais
            // \n -> Quebra de Linha
            System.out.printf("Empregado %d: R$ %.2f\n", (i+1), salarios[i]);
        }
    }
}
