// Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
// calcular e escrever a área e o perímetro do retângulo

import java.util.Scanner;

public class Ex02Lista02{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float base, altura, area, perimetro;

        System.out.println("Insira, respectivamente, a base e a altura do retângulo: ");
        base = in.nextFloat();
        altura = in.nextFloat();

        area = base * altura;
        perimetro = 2 * (base + altura);

        System.out.println("A Área do retângulo é: " + area);
        System.out.println("O Perímetro do retângulo é: " + perimetro);
        in.close();
    } 
}