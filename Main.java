public class Main {
    public static void main(String[] args) {
        
        DadosContratacao dadosMaria = new DadosContratacao();
        dadosMaria.nomeSegurado = "Maria da Silva";
        dadosMaria.valorFipe = 45000.00;
        dadosMaria.coberturaTerceiros = 100000.00;

        DadosContratacao dadosJoao = new DadosContratacao();
        dadosJoao.nomeSegurado = "João Souza";
        dadosJoao.capitalSegurado = 600000.00;
        EmissorApolice emissorAuto = new EmissorAuto();
        EmissorApolice emissorVida = new EmissorVida();

        System.out.println("Processando Apólices...\n");

        try {
            // o cliente chama o método centralizado do Criador. 
            // o emissor de auto chama a fábrica de auto e processa como auto!
            String resumoAuto = emissorAuto.processarContratacao(dadosMaria);
            System.out.println(resumoAuto);

            // o emissor de vida chama a fábrica de auto e processa como auto!
            String resumoVida = emissorVida.processarContratacao(dadosJoao);
            System.out.println(resumoVida);

        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}