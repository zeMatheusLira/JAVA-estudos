package blocosinicializacao.test;

import blocosinicializacao.dominio.Anime;

public class animeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpisodios());

        for (int episodio: anime.getEpisodios()) {
            System.out.print(episodio+" ");
        }
    }
}
