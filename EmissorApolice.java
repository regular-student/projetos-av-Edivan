public abstract class EmissorApolice {
    protected abstract Apolice criarApolice(DadosContratacao dados);
    public final String processarContratacao(DadosContratacao dados) {
        // Chama a fábrica 
        Apolice apolice = criarApolice(dados);

        apolice.calcularPremio();
        apolice.listarDocumentos();

        return apolice.gerarResumo();
    }
}