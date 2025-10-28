// Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
// média da viagem, informe o tempo que uma família levará saindo de sua cidade de
// férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
// calculado.

import java.util.Scanner;

public class Ex07Lista01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float distancia, velocidadeMedia, tempo;

        System.out.println("Informe a distância que uma família deverá percorrer para chegar até a cidade de férias: ");
        distancia = in.nextFloat();

        System.out.println("Informe a velocidade média que família irá utilizar durante a viagem: ");
        velocidadeMedia = in.nextFloat();

        tempo = distancia / velocidadeMedia;

        System.out.println("O tempo aproximado será de: " + tempo + " horas.");
        in.close();
    }
}
