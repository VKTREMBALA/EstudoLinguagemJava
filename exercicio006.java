package exercicios_basicos;

// Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse

import java.util.Scanner;

public class exercicio006 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        float salarioMinimo = 1300, salarioUsuario, quantidadeSalario;

        System.out.println("Informe seu salario");
        salarioUsuario = entrada.nextFloat();

        quantidadeSalario = salarioUsuario / salarioMinimo;

        System.out.println("O salario do usuario no valor de " + salarioUsuario + " equivalem a " + quantidadeSalario);
    }
}
