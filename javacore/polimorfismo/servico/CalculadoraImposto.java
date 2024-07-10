package polimorfismo.servico;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Produto;
import polimorfismo.dominio.Taxavel;
import polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularimpostor();
        System.out.println("Computador "+computador.getNome());
        System.out.println("Valor "+computador.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

    public static void calcularImpostoComputador(Tomate tomate){
        System.out.println("Relatório de imposto do tomate");
        double imposto = tomate.calcularimpostor();
        System.out.println("Tomate "+tomate.getNome());
        System.out.println("Valor "+tomate.getValor());
        System.out.println("Imposto a ser pago "+imposto);
    }

    public static void calcularImposto(Produto produto){
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularimpostor();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Valor do produto:  "+produto.getValor());
        System.out.println("Imposto a ser pago "+imposto);
        // uma forma de desacoplar e diminuir a quantidade de codigo
        //deixa um pouco mais generico, mas com o msm resultado
    }
}
