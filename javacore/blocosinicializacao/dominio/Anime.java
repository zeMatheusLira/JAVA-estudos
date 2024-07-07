package blocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;
//0 - Bloco de inicialização estáico da super classe é executado quando a jvm carregar a classe filha
// 1 - Alocado em espaco em memoria pro objeto
// 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
// 3- Bloco de inicializacao é executado
// 4- Construtor é executado

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios =  new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i]=i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        episodios =  new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i]=i+1;
        }
        for (int episodios: this.episodios){
            System.out.print(episodios+" ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
