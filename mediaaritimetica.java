package exercicios_basicos;
public class mediaaritimetica {
    /*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
    números 4, 5 e 6. A soma das duas médias. A média das médias. */

    public static void main(String[] args) {
        float calmedia = (8 + 9 + 7) / 3;
        float calmedia2 = (4 + 5 + 6) / 3;
        float somamedia = calmedia + calmedia2;
        float mediamedia = somamedia / 2;

        System.out.printf("A media com os numeros 8,9 e 7 e = %.2f\n A media entre os numeros 4, 5 e 6 e = %.2f\n A soma das medias = %.2f\n A media das medias e = %.2f ", calmedia, calmedia2, somamedia, mediamedia);

    }
}
