package construtores.test;

import construtores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("TV",15,"Demon Slayer","Ação", "Production IG");
        //anime.init("TV",12,"Death Note","Ação");
        anime.imprime();
    }
}
