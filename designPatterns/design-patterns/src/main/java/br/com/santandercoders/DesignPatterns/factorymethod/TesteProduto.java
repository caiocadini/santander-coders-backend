package br.com.santandercoders.DesignPatterns.factorymethod;

public class TesteProduto {
    public static void main (String[] args){
        Produto produtoDigital = ProdutoFactory.getInstance(TipoProdutoEnum.DIGITAL);
        Produto produtoFisico = ProdutoFactory.getInstance(TipoProdutoEnum.FISICO);

        System.out.println(produtoDigital.toString());
        System.out.println(produtoFisico.toString());
    }
}
