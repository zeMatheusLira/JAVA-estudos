package modificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;
// 0 - Bloco de inicializacao é executado quando o JVM carregar a classe
// 1 - Alocado em espaco em memoria pro objeto
// 2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
// 3- Bloco de inicializacao é executado
// 4- Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização estático 1");
        episodios =  new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i]=i+1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 2");
    }
    static {
        System.out.println("Dentro do bloco de inicialização estático 3");
    }
    {
        System.out.println("Dentro do bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        episodios =  new int[100];
        for(int i = 0; i < episodios.length; i++){
            episodios[i]=i+1;
        }
        for (int episodios: Anime.episodios){
            System.out.print(episodios+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
