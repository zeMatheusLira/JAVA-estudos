package classesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime(){
        System.out.println("Imprimindo...");
    }

    public abstract void calculaBonus();

}
// metodos abstract so pode existir em classes abstract, mas uma classe abstract pode ter metodos concretos e abstract