package exercicios_condicionais;

import java.util.Scanner;

public class numero_divisivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean divi_10 = (numero % 10 == 0);
        boolean divi_5 = (numero % 5 == 0);
        boolean divi_2 = (numero % 2 == 0);

        if (divi_10) {
            System.out.println("Este numero é divisivel por 10 ");
        }
        
        if (divi_5) {
            System.out.println("Este numero é divisivel por 5 ");
        }

        if (divi_2) {
            System.out.println("Este numero é divisivel por 2 ");
        }
        
        if (!divi_10 && !divi_5 && !divi_2) {
            System.out.println("O número não é divisível por 2, 5 e 10.");
        }

        scanner.close();
    }
}
