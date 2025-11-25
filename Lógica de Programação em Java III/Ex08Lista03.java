// Faça um algoritmo para ler um número que é um código de usuário. 

// Caso este código seja diferente de um código armazenado internamente no algoritmo (igual a 1234) 
// deve ser apresentada a mensagem “Usuário inválido!”. 

// Caso o Código seja correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a
// certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. 

// Caso a senha esteja correta, deve ser mostrada a mensagem “Acesso permitido”.

import java.util.Scanner;

public class Ex08Lista03{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int codigoTentativa;
        int senhaTentativa;
        final int codigo = 1234;
        final int senha = 9999;

        System.out.println("Bem Vindo!");
        System.out.println("Insira seu Código de Usuário: ");
        codigoTentativa = in.nextInt();

        if(codigoTentativa != codigo){
            System.out.println("Usuário Inválido");
            in.close();
        } else {
            System.out.println("Olá usuário N° " + codigo + ", para Prosseguir Insira sua Senha: ");
            senhaTentativa = in.nextInt();

            if(senhaTentativa != senha){
                System.out.println("Senha Incorreta");
                in.close();
            } else {
                System.out.println("Acesso Permitido");
            }
        }

        in.close();
    }
}