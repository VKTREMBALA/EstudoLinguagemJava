package repeticao_java;

import java.util.Scanner;

public class dulpla_chegagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int quantidade2 = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Informe um numero entre 0 e 100 ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                quantidade++;
            }if (numero >= 101 && numero <= 200) {
                quantidade2++;
            }
        }
        scanner.close();
        System.out.println("Quantidade de numeros que estao entre 0 e 100 sao: " + quantidade);
        System.out.println("Quantidade de numeros que estao entre 101 e 200 sao: " + quantidade2);
    }
}
