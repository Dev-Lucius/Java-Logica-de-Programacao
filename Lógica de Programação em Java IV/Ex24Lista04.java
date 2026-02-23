/*
Criar um algoritmo em Java que leia um conjunto de informações (nome, sexo,
idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar:
    - O atleta do sexo masculino mais alto;
    - A atleta do sexo feminino mais pesada;
    - A média de idade dos atletas.
Deverão ser lidos dados dos atletas até que seja digitado o nome @ para um atleta.
*/

import java.util.Scanner;

public class Ex24Lista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome;
        String sexo;
        int idade;
        int peso, altura;

        int masculinoMaisAlto = 0;
        int femininaMaisPesada = 0;

        int somaIdades = 0;
        int i = 0;
        double mediaIdadesAtletas;

        while (true) {
            System.out.println("Informe o Nome de um Atleta: ");
            nome = in.next();

            if(nome.equals("@")){
                break;
            }

            System.out.println("Informe o Sexo Deste(a) Atleta: ");
            System.out.println("masculino ou feminino");
            sexo = in.next();

            if(sexo.equalsIgnoreCase("masculino")){
                System.out.println("Informe a Idade deste Atleta: ");
                idade = in.nextInt();
                somaIdades = somaIdades + idade;
                i++;

                System.out.println("Informe o Peso deste Atleta: ");
                peso = in.nextInt();

                System.out.println("Informe a Altura deste Atleta: ");
                altura = in.nextInt();

                if(altura > masculinoMaisAlto){
                    masculinoMaisAlto = altura;
                }
            }

            else if(sexo.equalsIgnoreCase("feminino")){
                System.out.println("Informe a Idade deste Atleta: ");
                idade = in.nextInt();
                somaIdades = somaIdades + idade;
                i++;

                System.out.println("Informe o Peso deste Atleta: ");
                peso = in.nextInt();

                System.out.println("Informe a Altura deste Atleta: ");
                altura = in.nextInt();

                if(peso > femininaMaisPesada){
                    femininaMaisPesada = peso;
                }
            } else {
                System.out.println("Informe um Sexo Válido");
            }
        }

        mediaIdadesAtletas = somaIdades / i;

        System.out.println("Resultados");
        System.out.printf("A Média Das Idades será %.2f\n", mediaIdadesAtletas);
        System.out.println("Atleta Masculino Mais Alto: " + masculinoMaisAlto);
        System.out.println("Atleta Feminina Mais Pesada: " + femininaMaisPesada);

        in.close();
    }
}
