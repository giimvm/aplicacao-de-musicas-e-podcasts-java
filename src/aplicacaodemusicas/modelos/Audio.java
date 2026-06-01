package aplicacaodemusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int curtidas;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void curtir() {
        curtidas++;
    }

    public void reproduzir() {
        totalReproducoes++;
    }

    public int classificar() {
        if (getTotalReproducoes() == 0) {
            return 0;
        }

        double proporcao = (double) getCurtidas() / getTotalReproducoes();

        if (proporcao >= 0.8) {
            return 5;
        } else if (proporcao >= 0.6) {
            return 4;
        } else if (proporcao >= 0.4) {
            return 3;
        } else if (proporcao >= 0.2) {
            return 2;
        }

        return 1;
    }

    public void exibirFicha() {
        System.out.println("Título: " + titulo);
        System.out.println("Duração: " + duracao + " min");
        System.out.println("Curtidas: " + curtidas);
        System.out.println("Reproduções: " + totalReproducoes);
        System.out.println("Classificação: " + classificar() + "★");
    }
}

