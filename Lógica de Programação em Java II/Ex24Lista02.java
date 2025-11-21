// Escreva um programa que faça a leitura da idade de 2 homens e 2 mulheres
// (supondo que as idades do mesmo sexo serão diferentes). 

// O programa deve fazer o somatório da idade do homem mais velho com a idade da mulher mais nova e o
// produto da idade do homem mais novo pela idade da mulher mais velha. 

// Ao final você deve imprimir os resultados, e cada uma das idades digitadas: mulher mais
// nova, mulher mais velha, homem mais novo e homem mais velho

import java.util.Scanner;

public class Ex24Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int homemMaisVelho, mulherMaisVelha;
        int homemMaisNovo, mulherMaisNova;
        double somatorio, produto;

        System.out.println("Insira as Idades de Dois Homens: ");
        int homem1 = in.nextInt();
        int homem2 = in.nextInt();

        if(homem1 > homem2){
            homemMaisVelho = homem1;
            homemMaisNovo = homem2;
        } else {
            homemMaisVelho = homem2;
            homemMaisNovo = homem1;
        }

        System.out.println("Insira as Idades de Dois Homens: ");
        int mulher1 = in.nextInt();
        int mulher2 = in.nextInt();

        if(mulher1 > mulher2){
            mulherMaisVelha = mulher1;
            mulherMaisNova = mulher2;
        } else {
            mulherMaisVelha = mulher2;
            mulherMaisNova = mulher1;
        }

        // Somatorio -> homemMaisVelho + mulherMaisNova
        // Produto -> homemMaisNovo * mulherMaisVelha
        somatorio = homemMaisVelho + mulherMaisNova;
        produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("RESULTADOS");
        System.out.println("Homem Mais Velho " + homemMaisVelho);
        System.out.println("Homem Mais Novo " + homemMaisNovo);
        System.out.println("Mulher Mais Velho " + mulherMaisVelha);
        System.out.println("Mulher Mais Nova " + mulherMaisNova);
        System.out.println("Somatório: " + somatorio);
        System.out.println("Produto: " + produto);
        in.close();
    }
}
