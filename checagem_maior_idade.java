package repeticao_java;

import java.util.Scanner;

public class checagem_maior_idade {
    public static void main(String[] args) {
        int maior_de_18 = 0;
        int menor_de_18 = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.print("Qual sua idade? ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                maior_de_18++;
            }else{
                menor_de_18++;
            }
        }
        scanner.close();
        
        System.out.println("O total de maior de idade: " + maior_de_18);
        System.out.println("O total de menos de idade: " + menor_de_18);
    }
}
