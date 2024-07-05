package sobrecargametodos.test;

import sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("TV",12,"Death Note","Ação");
        anime.imprime();
    }
}
