package modificadorestatico.dominio;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 250;
// Modificador de acesso estatico vai fazer o atributo pertencer a classe e todos os objetos vao compartilhar o mesmo valor
    public void imprime() {
        System.out.println("---------");
        System.out.println("Nome " + this.nome);
        System.out.println("Velocidade máxima " + this.velocidadeMaxima);
        System.out.println("Velocidade limite " + Carro.velocidadeLimite);
    }

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxinma(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
