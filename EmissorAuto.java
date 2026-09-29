// Fábrica de Automóvel
public class EmissorAuto extends EmissorApolice {
    @Override
    protected Apolice criarApolice(DadosContratacao dados) {
        // Por que isso existe? É aqui que isolamos o operador "new". 
        // Se a classe cliente quer uma apólice auto, ela chama esse emissor, e ele devolve a apólice correta.
        return new ApoliceAuto(dados);
    }
}

