/*
Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.

Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).

Também testar se saldo atual for maior ou igual a zero escrever a mensagem “Saldo
Positivo”, senão escrever a mensagem “Saldo Negativo 
*/
import java.util.Scanner;

public class Ex22Lista02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numContaCliente;
        float saldo, debito, credito;
        double saldoAtual;

        System.out.println("Informe, RESPECTIVAMENTE, o Numero da Conta de um Cliente, seu saldo, seu debito e o seu Crédito: ");
        numContaCliente = in.nextInt();
        saldo = in.nextFloat();
        debito = in.nextFloat();
        credito = in.nextFloat();

        saldoAtual = (saldo - debito) + credito;

        if(saldoAtual >= 0){
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        in.close();
    }
}
