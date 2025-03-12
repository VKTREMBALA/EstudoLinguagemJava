package exercicios_basicos;

// Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

import java.util.Scanner;

public class exercicio005 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int num, antecessor, sucessor;

        System.out.println("Informe um valor :");
        num = entrada.nextInt();

        antecessor = num -1;
        sucessor = num + 1;

        System.out.println("Numero escolhido foi " + num + " antecessor = " + antecessor + " e sucessor " + sucessor);
    }
}
