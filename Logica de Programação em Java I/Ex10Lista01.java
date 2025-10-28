// Desenvolva um algoritmo que será utilizado para automatizar o cálculo do público e
// da renda total de um evento esportivo. Este evento esportivo possui um valor fixo
// cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
// o evento possuem um desconto de 30% no valor do ingresso e as crianças menoresde 10 anos não pagam ingresso. 
// Baseado nos dados acima apresentados o usuário
// deverá digitar 4 informações de entrada para o sistema, são elas:

// - Valor de cada ingresso
// - Número de pessoas (público do evento) que são sócias do clube
// - Número de pessoas (público do evento) não pagantes (menores de 10 anos)
// - Número de pessoas (público do evento) pagantes (sem desconto algum)

// O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
// e o valor que deixou de ser arrecadada devido aos descontos e isenções.

import java.util.Scanner;

public class Ex10Lista01 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float valorIngresso;
        int qtdSocios, qtdNaoPagantes, qtdPagantes;
        int publicoTotal;

        System.out.println("Informe o valor do Ingresso: ");
        valorIngresso = in.nextFloat();
        
        System.out.println("Informe, respectivamente, a quantidade de sócios, não pagantes e pagantes: ");
        qtdSocios = in.nextInt();
        qtdNaoPagantes = in.nextInt();
        qtdPagantes = in.nextInt();
        publicoTotal = qtdSocios + qtdNaoPagantes + qtdPagantes;

        double valorArrecadado = (qtdPagantes * valorIngresso) + (qtdSocios * (valorIngresso * 0.7));

        double perdaNaoPagante = qtdNaoPagantes * valorIngresso;
        double perdaSocios = qtdSocios * (valorIngresso * 0.3);
        double perdaTotal = perdaSocios + perdaNaoPagante;

        System.out.printf("O público total do evento foi de %d pessoas.%n", publicoTotal);
        System.out.printf("A renda total do evento foi de R$ %.2f.%n", valorArrecadado);
        System.out.printf("O valor que deixou de ser arrecadado devido aos descontos e isenções foi de R$ %.2f.%n", perdaTotal);
        in.close();
    }
}
