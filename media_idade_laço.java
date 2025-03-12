package repeticao_java;

import java.util.Scanner;

public class media_idade_laço {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int media = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Informe sua idade ");
            int idade = scanner.nextInt();
            soma += idade;
            media = soma / 3;
        }
        System.out.println("A media das idades é " + media);
        scanner.close();

    }
}