// Ler o nome de dois times e o número de gols marcados na partida (para cada time).
// Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a
// palavra EMPATE.

import java.util.Scanner;

public class Ex06Lista03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time1, time2;
        int golsTime1, golsTime2;

        System.out.println("Insira, Respectivamente, o nome e o saldo de Gols de um time de Futebol: ");
        time1 = in.next();
        golsTime1 = in.nextInt();
        time2 = in.next();
        golsTime2 = in.nextInt();

        if(golsTime1 > golsTime2){
            System.out.println(time1 + " venceu com um saldo de " + golsTime1 + " gols");
        } else if(golsTime2 > golsTime1){
            System.out.println(time2 + " venceu com um saldo de " + golsTime2 + " gols");
        } else {
            System.out.println("Houve um Empate entre " + time1 + " e " + time2);
        }
    }
}
