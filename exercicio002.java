package exercicios_basicos;

import java.util.Scanner;

public class exercicio002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int valorA, valorB, valorC, soma;

        System.out.println("Informe o valor de A: ");
        valorA = entrada.nextInt();

        System.out.println("Informe o valor de B: ");
        valorB = entrada.nextInt();

        System.out.println("Informe o valor de C: ");
        valorC = entrada.nextInt();

        soma = valorA + valorB;

        if (soma > valorC){
            System.out.println("A soma entre A e B é " + soma + ", o valor da soma é maior que o valor de C");
        }
    }
}
