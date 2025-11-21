/*
Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
dia e terminar no dia seguinte
*/
import java.util.Scanner;

public class Ex15Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempoInicial, tempoFinal;
        int horasTotais = 0;

        System.out.println("Informe Respectivamente, em HORAS, o tempo de início e de fim de uma Partida de Xadrez: ");
        tempoInicial = in.nextInt();
        tempoFinal = in.nextInt();

        if(tempoFinal > tempoInicial){
            horasTotais = tempoFinal - tempoInicial;
        } else if (tempoInicial > tempoFinal) {
            horasTotais = (24 - tempoInicial) + tempoFinal;
        } else {
            horasTotais = 24;
        }

        System.out.println("A duração da Partida de Xadrez durou " + horasTotais + " horas");
        in.close();
    }
}
