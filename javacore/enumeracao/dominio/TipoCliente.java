package enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física" ),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int VALOR, String nomeRelatorio){
        this.VALOR = VALOR;
        this.nomeRelatorio = nomeRelatorio;
    }
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }
}
