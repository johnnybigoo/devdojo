package academy.devdojo.maratonajava.javacore.sobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive", "TV", 12, "Ação");
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.imprime();
    }
}
