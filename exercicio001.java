package exercicios_basicos;

import java.util.Scanner;

public class exercicio001 {

    public static void main(String[] args){

        int loginUsuario, senhaUsuario;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.printf("Informe seu usuario: ");
            loginUsuario = entrada.nextInt();

            if (loginUsuario != 1234){
                System.out.printf("Usuário inválido!\n");

            }
        }while (loginUsuario != 1234);

        do {
            System.out.printf("Informe a senha: ");
            senhaUsuario = entrada.nextInt();

            if (senhaUsuario == 9999){
                System.out.printf("Acesso permitido!");
            }else{
                System.out.printf("Acesso negado!\n");
            }
        }while (senhaUsuario != 9999);
    }
}
