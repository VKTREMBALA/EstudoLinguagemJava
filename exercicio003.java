package exercicios_basicos;

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

import java.util.Scanner;

public class exercicio003 {
    public static void main(String[] args){

        double num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        num = entrada.nextDouble();

        if (num % 2 == 0){
            System.out.println("Este numero é par");
        }else{
            System.out.println("Este numero é impar");
        }

        if (num > 0){
            System.out.println("Este numero é positivo");
        }else {
            System.out.println("Este numero é negativo");
        }
    }
}
