package repeticao_java;

import java.util.Scanner;

public class print_nomes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual e seu nome? ");
        var nome = scanner.next();

        for(int i = 0; i < 10; i++){
            System.out.println(nome);
        }

        scanner.close();
    }
}