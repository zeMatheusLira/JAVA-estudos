package enumeracao.test;

import enumeracao.dominio.Cliente;
import enumeracao.dominio.Cliente.TipoPagamento;
import enumeracao.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Teteu", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente02 = new Cliente("Rafa",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
        Cliente cliente03 = new Cliente("José",TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente04 = new Cliente("Marcos",TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente01);
        System.out.println(cliente02);
        System.out.println(cliente03);
        System.out.println(cliente04);
    }
}
