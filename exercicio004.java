package exercicios_basicos;

//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,

import java.util.Scanner;

public class exercicio004 {
    public static void main(String[] args){
        int valorA, valorB, soma;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        valorA = entrada.nextInt();

        System.out.println("Informe o valor de B: ");
        valorB = entrada.nextInt();

        if (valorA == valorB){
            soma = valorA + valorB;
            System.out.println("Os valores sao iguais somados dão : " + soma);
        }else{
            System.out.println("Os valores nao sao iguais, por isso nao foram somados");
        }
    }
}
