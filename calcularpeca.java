package exercicios_basicos;
public class calcularpeca {
    /*
    - a porcentagem do IPI a ser acrescido no valor das peças
    - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
    - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
    O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
    Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
     */
    public static void main(String[] args) {
        int peca = 1;
        int valorpeca = 1;
        int peca2 = 2;
        int valorpeca2 = 2;

        var valortotal = (peca*valorpeca + peca2*valorpeca2) * (5/100 + 1);
        System.out.println(valortotal);
    }
}
