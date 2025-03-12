package exercicios_basicos;
import java.util.Scanner;

public class primeiroprograma{
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        System.out.println("Quantos anos voce tem? ");
        int idade = dados.nextInt();

        System.out.println("Quantos meses voce tem? ");
        int meses = dados.nextInt();

        System.out.println("Quantos dias? ");
        int dias = dados.nextInt();

        int totaldias = (idade * 365) + (meses * 30) + dias;

        System.out.printf("%d anos, %d meses e %d dias = %d dias", idade, meses, dias, totaldias);

        dados.close();
    }    
}