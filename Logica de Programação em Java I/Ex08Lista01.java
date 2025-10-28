// Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
// A entrada de dados será:

// ● Número total de eleitores;
// ● Número de votos válidos;
// ● Número de votos brancos;
// ● Número de votos nulos.

// O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
// relação ao total de eleitores):

// ● Percentual de votos válidos;
// ● Percentual de votos brancos;
// ● Percentual de votos nulos;

import java.util.Scanner;

public class Ex08Lista01{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Informe, respectivamente, o número de votos válidos, brancos e nulos: ");
        float votosValidos = in.nextFloat();
        float votosBrancos = in.nextFloat();
        float votosNulos = in.nextFloat();

        float totalEleitores = votosValidos + votosBrancos + votosNulos;

        // Percentuais
        float percentualValidos = (votosValidos / totalEleitores) * 100;
        float percentualBrancos = (votosBrancos / totalEleitores) * 100;
        float percentualNulos = (votosNulos / totalEleitores) * 100;

        // Printando Resultados
        System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        System.out.printf("Percentual de votos Brancos: %.2f%%\n", percentualBrancos);
        System.out.printf("Percentual de votos Nulos: %.2f%%\n", percentualNulos);

        in.close();
    }
}

