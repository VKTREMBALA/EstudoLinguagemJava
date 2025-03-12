package exercicios_basicos;
import java.util.Scanner;

/*
Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor.)      
 */

public class sucessor {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor1 = valor.nextInt();
        
        int sucessor = valor1 + 1;
        int antecessor = valor1 - 1;

        System.out.printf("Seu numero e : %d Seu sucessor e %d e seu Antecessor e %d", valor1, sucessor, antecessor);
        valor.close();
    }
}
