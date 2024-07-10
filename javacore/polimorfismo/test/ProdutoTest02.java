package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("RYZEN 5 5600G", 1000);
        Produto produto2 = new Tomate("Verde", 15);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularimpostor());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularimpostor());
    }
}
