package aplicacaodemusicas.principal;

import aplicacaodemusicas.modelos.Musica;
import aplicacaodemusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica dagger = new Musica();

        dagger.setTitulo("Dagger");
        dagger.setCurtidas(160);
        dagger.setTotalReproducoes(200);
        dagger.setDuracao(2.38);
        dagger.setArtista("Slowdive");
        dagger.setAlbum("Souvlaki");
        dagger.setGenero("Showegaze");

        dagger.curtir();
        dagger.reproduzir();

        dagger.exibirFicha();

        Podcast devnaestrada = new Podcast();

        devnaestrada.setTitulo("Dev na Estrada #250");
        devnaestrada.setDuracao(58.30);
        devnaestrada.setCurtidas(420);
        devnaestrada.setTotalReproducoes(500);

        devnaestrada.setHost("Rômulo Barbosa e convidados");
        devnaestrada.setDescricao("Discussão sobre carreira, desenvolvimento de software e tecnologia.");

        devnaestrada.curtir();
        devnaestrada.reproduzir();

        devnaestrada.exibirFicha();
    }
}
