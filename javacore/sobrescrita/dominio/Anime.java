package sobrescrita.dominio;

public class Anime extends Object{
    private String nome;

    @Override
    public String toString(){
        return "Anime "+nome;
    }


    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
