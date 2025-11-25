/*
11.
Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
do lado (em cm). Calcular e imprimir o seguinte:

    - Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
    perímetro.
    - Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
    - Se o número de lados for igual a 5 escrever PENTÁGONO.
    Observação: Considere que o usuário só informará os valores 3, 4 ou 5.

12.
Acrescente as seguintes mensagens à solução do exercício anterior conforme o
caso: 

    - Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
    - Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

Observação: Considere que o usuário poderá informar qualquer valor para o número de lados

*/
import java.util.Scanner;

public class Ex11and12Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numLados;
        int medidaLado;

        System.out.println("Informe o numero de Lados de um Polígono Qualquer: ");
        numLados = in.nextInt();

        System.out.println("Informe a Medida em Cm deste Lado: ");
        medidaLado = in.nextInt();

        if(numLados < 3){
            System.out.println("Não é um Polígono!");
        } else if(numLados == 3){
            System.out.println("É um triângulo");
            System.out.println("Perimetro = " + (medidaLado * 3));
        } else if(numLados == 4){
            System.out.println("É um Quadrado");
            System.out.println("Area = " + (medidaLado * medidaLado));
        } else if(numLados == 5){
            System.out.println("É um pentagono");
        } else {
            System.out.println("Polígono Não Identificado");
        }
    }
}
