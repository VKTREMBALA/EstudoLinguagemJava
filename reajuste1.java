package exercicios_basicos;
import java.util.Scanner;

public class reajuste1 {
    public static void main(String[] args) {
        /*
        Informar um saldo e imprimir o saldo com reajuste de 1%.
         */

        Scanner saldo = new Scanner(System.in);
        System.out.print("Informe seu saldo : ");
        
        float valor = saldo.nextFloat();
        float reajuste = valor * 0.01f;

        System.out.printf("O seu saldo com reajuste de 1 porcento e = %.2f ",valor + reajuste);

        saldo.close();
    }
    
}