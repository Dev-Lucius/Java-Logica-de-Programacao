// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// 
// Álcool:
// - Até 20 litros, desconto de 3% por litro
// - Acima de 20 litros, desconto de 5% por litro
//
// Gasolina:
// - Até 20 litros, desconto de 4% por litro
// - Acima de 20 litros, desconto de 6% por litro
//
// Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
// (A para álcool, G para gasolina). Calcule e imprima o valor a ser pago pelo cliente,
// sabendo que o litro da gasolina custa R$ 4.30 e o do álcool custa R$ 3.90.

import java.util.Scanner;

public class Ex07Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char combustivel;
        String tipoCombustivel = "";
        int litros;
        double preco = 0;

        System.out.println("Insira o Tipo de Combustível Desejado: ");
        combustivel = in.next().charAt(0);

        System.out.println("Informe Quantos Litros serão Abastecidos: ");
        litros = in.nextInt();

        if(combustivel == 'a'){
            // Alcool
            tipoCombustivel = "Alcool";
            if(litros <= 20) {
                preco = (litros * 3.90) * 0.97;
            } else {
                preco = (litros * 3.90) * 0.95;
            }
        }

        if(combustivel == 'g'){
            // Gasolina
            tipoCombustivel = "Gasolina";
            if(litros <= 20){
                preco = (litros * 4.30) * 0.96;
            } else {
                preco = (litros * 4.30) * 0.94;
            }
        }

        System.out.println("RESULTADOS");
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
        System.out.println("Preço Total: " + preco);
        in.close();
    }
}
