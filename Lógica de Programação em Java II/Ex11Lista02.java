// Faça um programa que receba dois números e efetua a adição. Caso o valor
// somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
// o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
// 10.

import java.util.Scanner;

public class Ex11Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numA, numB;

        System.out.println("Insira dois números: ");
        numA = in.nextInt();
        numB = in.nextInt();

        // Soma Maior do que 20
        if((numA + numB) > 20){
            System.out.println((numA + numB + 8));
        }

        // Soma Menor ou Igual a 20
        if((numA + numB) <= 20){
            System.out.println((numA + numB - 10));
        }

        in.close();
    }
}
