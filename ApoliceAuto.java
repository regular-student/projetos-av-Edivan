public class ApoliceAuto extends Apolice {
    private DadosContratacao dados;

    public ApoliceAuto(DadosContratacao dados) {
        super("Auto-", dados.nomeSegurado);
        this.dados = dados;
    }

    @Override
    public void calcularPremio() {
        double premioAnual = dados.valorFipe * 0.08;

        this.premioMensal = premioAnual / 12;
    }

    @Override
    public void listarDocumentos() {
        this.documentosExigidos.add("CNH");
        this.documentosExigidos.add("CRLV");
    }
}
