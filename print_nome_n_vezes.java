package repeticao_java;

import java.util.Scanner;

public class print_nome_n_vezes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        var nome = scanner.nextLine();

        System.out.print("Quantas vezes quer repetir o nome? ");
        int repeticao = scanner.nextInt();

        for(int i = 1; i <= repeticao; i++) {
            System.out.println(nome);
        }

        scanner.close();
    }
}