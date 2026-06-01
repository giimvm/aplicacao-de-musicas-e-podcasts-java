package aplicacaodemusicas.modelos;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibirFicha() {
        System.out.println("\n===== PODCAST =====");

        super.exibirFicha();

        System.out.println("Host: " + host);
        System.out.println("Descrição: " + descricao);
    }
}