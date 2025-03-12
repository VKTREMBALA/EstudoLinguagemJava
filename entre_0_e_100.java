package repeticao_java;

import java.util.Scanner;

public class entre_0_e_100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Informe um numero entre 0 e 100 ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                quantidade++;
            }
        }
        scanner.close();
        System.out.println("Quantidade de numeros que estao entre 0 e 100 sao: " + quantidade);
    }
}
