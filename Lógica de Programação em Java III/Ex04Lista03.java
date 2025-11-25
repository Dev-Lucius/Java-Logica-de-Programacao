// Ler três valores (considere que não serão informados valores iguais) e escrevê-los
// em ordem crescente.

import java.util.Scanner;

public class Ex04Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3;
        

        System.out.println("Insira Três Valores: ");
        valor1 = in.nextInt();
        valor2 = in.nextInt();
        valor3 = in.nextInt();

        // Ordenação Simples Por troca
        // A ideia é ... 
        //  - Comparar Dois Valores
        //  - Se estiverem na ordem errada, trocar de posição
        //  - Repetir conforme o Número de Variáveis 
        // Ex ... {8 e 3} ==> {Ordenação} ==> {3 e 8}
        if(valor1 > valor2){
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if(valor2 > valor3){
            int temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }

        if(valor1 > valor2){
            int temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        System.out.println(valor1 + " - " + valor2 + " - " + valor3);
        in.close();
    }
}
