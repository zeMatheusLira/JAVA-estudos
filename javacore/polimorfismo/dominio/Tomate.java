package polimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    private String DataValidade;
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    public Tomate(String DataValidade, String nome, double valor){
        super(nome, valor);
        this.DataValidade = DataValidade;
    }

    @Override
    public double calcularimpostor() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String dataValidade) {
        DataValidade = dataValidade;
    }
}
