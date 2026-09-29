public class EmissorVida extends EmissorApolice {
    @Override
    protected Apolice criarApolice(DadosContratacao dados) {
        return new ApoliceVida(dados);
    }
}