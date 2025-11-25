// Ler três valores (considere que não serão informados valores iguais) e escrever a
// soma dos dois maiores

import java.util.Scanner;

public class Ex03Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3;
        int soma = 0;

        System.out.println("Insira três Valores: ");
        valor1 = in.nextInt();
        valor2 = in.nextInt();
        valor3 = in.nextInt();

        // Ordenação Por Troca
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

        // Garante que os Valores 2 e 3 serão sempre os Maiores
        soma = valor2 + valor3;
        System.out.println("Soma :" + soma);

        in.close();
    }
}
