package Cartao;

public abstract class CartaoDePresente {

    public final String nomeRemetente;
    public final String nomeDestinatario;

    public CartaoDePresente(String nomeRemetente, String nomeDestinatario) {
        this.nomeRemetente = nomeRemetente;
        this.nomeDestinatario = nomeDestinatario;
    }

    public String mostrarMensagem(String texto) {
        return texto;
    }

    public abstract String mostrarMensagem();
}