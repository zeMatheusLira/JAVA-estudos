package associacao.dominio;

public class ProfessorSeminario {
    private String nome;
    private String especializacao;
    private Seminario[] seminarios;

    public ProfessorSeminario(String nome, String especializacao){
        this.nome = nome;
        this.especializacao = especializacao;
    }

    public ProfessorSeminario(String nome, String especializacao, Seminario[] seminarios) {
        this.nome = nome;
        this.especializacao = especializacao;
        this.seminarios = seminarios;
    }

    public void imprime(){
        if (this.seminarios == null){
            return;
        }
        System.out.println("-----------");
        System.out.println("Professor "+this.nome);
        System.out.println("Seminários cadastrados: ");
        for (Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("Alunos do seminário: ");
            for (AlunoSeminario alunos: seminario.getAlunos()){
                System.out.println("Aluno: "+ alunos.getNome()+" Idade "+alunos.getIdade());
            }
        }

    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}

