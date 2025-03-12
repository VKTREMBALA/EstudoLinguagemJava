package repeticao_java;

import java.util.Scanner;

public class sequencia_numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.println("Informe um valor: ");
            numero = scanner.nextInt();   
        } while (numero > 0);
        
        scanner.close();
    }
}
