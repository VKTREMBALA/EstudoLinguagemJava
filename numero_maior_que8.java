package repeticao_java;

import java.util.Scanner;

public class numero_maior_que8 {
    public static void main(String[] args) {
        int maior_que_8 = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Informe um valor " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero > 8) {
                maior_que_8++;
            }
        }
        scanner.close();
        System.out.println("O total de numero maiores que 8 sao : " + maior_que_8);
    }
}
