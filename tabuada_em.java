package repeticao_java;

import java.util.Scanner;

public class tabuada_em {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para inserir um número
        System.out.print("Digite um número para ver a tabuada: ");
        int num = scanner.nextInt();

        // Imprime a tabuada do número
        System.out.println("A tabuada do " + num + " é:");
        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }

        scanner.close();
    }        
}
