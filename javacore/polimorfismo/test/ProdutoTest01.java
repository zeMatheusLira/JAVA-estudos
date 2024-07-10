package polimorfismo.test;

import polimorfismo.dominio.Computador;
import polimorfismo.dominio.Televisao;
import polimorfismo.dominio.Tomate;
import polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args){
        Computador computador = new Computador("RYZEN 5700G", 1300);
        Tomate tomate = new Tomate("Vermelho", 10);
        Televisao tv = new Televisao("Samsung 50\" ",5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------");
        CalculadoraImposto.calcularImposto(tv);

    }
}
