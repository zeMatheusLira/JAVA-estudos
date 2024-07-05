package introducaometodos.dominio;

public class Funcionarios {
    private String nome;
    private int idade;
    public double salario;
    // public double[] salario; -> alteracao necessaria para o array new double[]{2000,3000,4000} do FuncionariosTest01

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    /* public void imprime(){
    System.out.println(this.nome);
    System.out.println(this.idade);
    for(double salario: salarios){
        System.out.println(salario+ " ")
        }
    }

    public void imprimeMediaSalario(){
        double media = 0;
        for(double salario: salarios){
            media+=salario;
            }
            media/salario.lenght
            System.out.println(media);
        }

 */
}
