package Cartao;

public class Main {
    public static void main(String[] args) {

        DiaDasMaes mae = new DiaDasMaes("wellington", "Maria");
        System.out.println("De : " + mae.nomeRemetente);
        System.out.println("Para : " + mae.nomeDestinatario);
        System.out.println(mae.mostrarMensagem());

        DiasDosNamorados namorados = new DiasDosNamorados("wellington", "Maria");
        System.out.println("De : " + namorados.nomeRemetente);
        System.out.println("Para : " + namorados.nomeDestinatario);
        System.out.println(namorados.mostrarMensagem());

        DiasDasCriancas crinca = new DiasDasCriancas("wellington", "Maria");
        System.out.println("De : " + crinca.nomeRemetente);
        System.out.println("Para : " + crinca.nomeDestinatario);
        System.out.println(crinca.mostrarMensagem());

    }
}
