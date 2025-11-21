// Faça um algoritmo que converta metros para centímetros. 
// Lembrando que 1m = 100cm

import java.util.Scanner;

public class Ex01Lista02{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        float metros, centimetros;

        System.out.println("Digite uma medida em Metros: ");
        metros = in.nextFloat();

        // cm = Metros * 100
        centimetros = metros * 100;
        System.out.println("A medida em Centímetros é: " + centimetros + "cm");
        in.close();
    }
}