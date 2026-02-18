import java.util.Scanner;

public class Ex20AlternativoLista04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lado;

        System.out.println("Informe o lado do Quadrado: ");
        lado = in.nextInt();

        if(lado < 1 || lado > 20){
            System.out.println("lado Inválido");
        }

        // Nesta iremos imprimir "*" quando:
        // - Está na primeira linha
        // - Está na última linha
        // - Está na primeira coluna
        // - Está na última coluna
        // Caso o Contrário Imprime Espaço
        for (int i = 1; i <= lado; i++) {
            for (int j = 1; j <= lado; j++) {

            if (i == 1 || i == lado || j == 1 || j == lado) {
                System.out.print("*");
            } else {
                System.out.print(" ");
                }
            }
        System.out.println();
        }

        in.close();
    }
}
