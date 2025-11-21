// Escreva um algoritmo para ler as dimensões de uma cozinha retangular
// (comprimento, largura e altura), calcular e escrever a quantidade de caixas de
// azulejos para se colocar em todas as suas paredes (considere que não será
// descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1.5
// m2 .

import java.util.Scanner;

public class Ex19Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float comprimento, largura, altura;
        double areaTotal;
        final double areaCxAzulejo = 1.5;
        double qtdCxsAzulejo;

        System.out.println("Informe respecitvamentem as seguintes Dimensões de um cozinha Retangular: ");
        System.out.println("Comprimento, Largura e Altura: ");
        comprimento = in.nextFloat();
        largura = in.nextFloat();
        altura = in.nextFloat();
        areaTotal = (2 * comprimento * largura) +  (2 * comprimento * altura) + (2 * altura * largura);

        qtdCxsAzulejo = Math.ceil(areaTotal / areaCxAzulejo);
        System.out.println("A quantidade total de Caixas de Azulejo será de: " + qtdCxsAzulejo);
        in.close();
    }
}
