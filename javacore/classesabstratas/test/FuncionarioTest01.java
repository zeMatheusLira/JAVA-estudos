package classesabstratas.test;

import classesabstratas.dominio.Desenvolvedor;
import classesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        gerente.imprime();
        System.out.println(gerente);
        desenvolvedor.imprime();
        System.out.println(desenvolvedor);


    }
}
