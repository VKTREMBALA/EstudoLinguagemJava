package repeticao_java;

import java.util.Scanner;

public class checagem_numeros_pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num_par = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Informe um valor : ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                num_par++;
            }
        }
        scanner.close();
        System.out.println("O total de numeros pares sao : " + num_par);
    }
}
