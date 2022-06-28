package Cartao;

public class DiasDasCriancas extends CartaoDePresente{

    public DiasDasCriancas(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    public String mostrarMensagem (){
        return "Feliz dia das Crianças";

    }

}
