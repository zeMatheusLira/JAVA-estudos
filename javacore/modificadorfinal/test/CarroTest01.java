package modificadorfinal.test;

import modificadorfinal.dominio.Carro;
import modificadorfinal.dominio.Porsche;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
        Porsche porsche = new Porsche();
        porsche.setNome("911");
        porsche.imprime();
    }
}
