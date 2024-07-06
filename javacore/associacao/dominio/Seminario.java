package associacao.dominio;

public class Seminario {
    private String titulo;
    private Local local;
    private AlunoSeminario[] alunos;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Local local, AlunoSeminario[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println(this.local);
        for (AlunoSeminario alunos : alunos) {
            System.out.println(alunos.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public AlunoSeminario[] getAlunos() {
        return alunos;
    }

    public void setAlunos(AlunoSeminario[] alunos) {
        this.alunos = alunos;
    }
}