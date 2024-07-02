package introducaoclasses.test;

import introducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche" ;
        carro1.modelo = "GT3 RS";
        carro1.ano = 2024;

        carro2.nome = "AUDI" ;
        carro2.modelo = "TT RS";
        carro2.ano = 2023;

        System.out.println(carro1.nome+" "+carro1.modelo+" "+carro1.ano);
        System.out.println(carro2.nome+" "+carro2.modelo+" "+carro2.ano);
    }
}
