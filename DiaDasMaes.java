package Cartao;

public class DiaDasMaes extends CartaoDePresente {

    public DiaDasMaes(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mostrarMensagem(){
        return "FELIZ DIA DAS MÃES!";
    }

}