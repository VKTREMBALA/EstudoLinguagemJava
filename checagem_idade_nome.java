package repeticao_java;
import java.util.Scanner;

public class checagem_idade_nome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomemaisnovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++){
            System.out.print("Informe seu nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Informe sua idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomemaisnovo = nome;
            }
        }
        System.out.println("Nome da pessoa mais nova e : " + nomemaisnovo + " e a idade e : " + idadeMaisNova);
        scanner.close();
    }
}
