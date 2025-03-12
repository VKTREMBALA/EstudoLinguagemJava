package repeticao_java;

import java.util.Scanner;

public class loço_com_10_valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Informe o valor " + (i + 1) + ": ");
            int valor = scanner.nextInt();
            soma += valor;
        }
        System.out.println(soma);
        scanner.close();

               
    }
}
