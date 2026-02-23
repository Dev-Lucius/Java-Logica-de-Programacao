/*
Escreva um algoritmo em Java que receba vários números e verifique se eles são ou
não quadrados perfeitos. O algoritmo termina a execução quando for digitado um
número menor ou igual a 0. (Um número é quadrado perfeito quando tem um
número inteiro como raiz quadrada.). 

Obs: não deve ser utilizado métodos da classe Math.
*/

import java.util.Scanner;

public class Ex25Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero;

        while (true) {

            System.out.println("Informe um número: ");
            numero = in.nextInt();

            if(numero <= 0){
                break;
            }

            // É melhor deixar o boolean dentro do while porque ele precisa ser reiniciado a cada nova verificação.
            // Se ele ficar fora, ele mantém o valor da execução anterior. Isso gera erro lógico.
            boolean verificador = false;

            // Um número é um quadrado perfeito se:
            // ∃ i ∈ ℕ tal que i² = n

            // Ex: 4
            // 1 - 2 - 3 - 4
            // 2 * 2 = 4
            // É um Quadrado Perfeito

            // { i * i <= numero } torna o nosso código mais eficiente
            // pois em certos casos, ele não é necessáriuo percorrer todos os antecessores da variável numero
            // Ex: numero = 10
            // Só iremos testar até 4 * 4, não faz sentido testar 10 * 10
            for(int i = 1; i * i <= numero; i++){
                if(i * i == numero){
                    verificador = true;
                    break;
                }
            }

            if(verificador){
                System.out.println("É um Quadrado Perfeito");
            } else{
                System.out.println("Não É um Quadrado Perfeito");
            }
        }

        System.out.println("Encerrando...");
        in.close(); 
    }
}
