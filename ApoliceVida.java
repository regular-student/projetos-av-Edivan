public class ApoliceVida extends Apolice {
    private DadosContratacao dados;

    public ApoliceVida(DadosContratacao dados) {
        super("VID-", dados.nomeSegurado);
        this.dados = dados;
    }

    @Override
    public void calcularPremio() {
        this.premioMensal = (dados.capitalSegurado * 0.03) / 12;
    }

    @Override
    public void listarDocumentos() {
        this.documentosExigidos.add("Documento de Identidade");
        this.documentosExigidos.add("CPF");
    }
}