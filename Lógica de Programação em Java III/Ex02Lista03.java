// Ler três valores (considere que não serão informados valores iguais) e escrever o
// maior deles

import java.util.Scanner;

public class Ex02Lista03{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor1, valor2, valor3;

        System.out.println("Insira três Valores: ");
        valor1 = in.nextInt();
        valor2 = in.nextInt();
        valor3 = in.nextInt();

        if(valor1 > valor2 && valor1 > valor3){
            System.out.println(valor1);
        } else if(valor2 > valor1 && valor2 > valor3){
            System.out.println(valor2);
        } else {
            System.out.println(valor3);
        }

        in.close();
    }
}