package sobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String nome;
    private String genero;

    public void init(String tipo, int episodios, String nome){
        this. tipo = tipo;
        this. episodios = episodios;
        this. nome = nome;
    }

    public void init(String tipo, int episodios, String nome, String genero){
        this. tipo = tipo;
        this. episodios = episodios;
        this. nome = nome;
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.nome);
        System.out.println(this.genero);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }
}

