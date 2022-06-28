package Cartao;

public class DiasDosNamorados extends CartaoDePresente{

    public DiasDosNamorados(String nomeRemetente, String nomeDestinatario) {
        super(nomeRemetente, nomeDestinatario);
    }

    @Override
    public String mostrarMensagem() {
        return "Feliz dia dos Namorados";
    }
}
