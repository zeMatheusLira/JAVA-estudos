package modificadorestatico.test;

import modificadorestatico.dominio.Carro;

public class carroTest01 {
    public static void main(String[] args) {// metodo static publico que nao retorna nada e se chama main recebendo um array como arg
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Mercedes", 275);
        Carro c3 = new Carro("Audi", 290);
        Carro.setVelocidadeLimite(180);
        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
