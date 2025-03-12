package exercicios_basicos;
import java.util.Scanner;

public class salariominimo {
    /*
    Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
    calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
    (1SM=R$788,00)
     */

    public static void main(String[] args) {
        float salarioMinimo = 788.0f;

        Scanner salario = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: ");
        float salarioUsuario = salario.nextFloat();
        float salarioMinimoUsuario = salarioUsuario / salarioMinimo;
        System.out.printf("Você ganha = R$ %.2f de salario que equivalem a %.2fx salários mínimos", salarioUsuario, salarioMinimoUsuario);

        salario.close();
    }
}
