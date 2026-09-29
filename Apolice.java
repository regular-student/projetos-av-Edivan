import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Apolice {
    protected String numeroApolice;
    protected String nomeSegurado;
    protected double premioMensal;
    protected List<String> documentosExigidos;
    protected LocalDate dataEmissao;

    public Apolice(String prefixo, String nomeSegurado) {
        this.numeroApolice = prefixo + UUID.randomUUID().toString().substring(0, 5).toUpperCase();
        this.nomeSegurado = nomeSegurado;
        this.dataEmissao = LocalDate.now();
        this.documentosExigidos = new ArrayList<>();
    }

    public abstract void calcularPremio();
    public abstract void listarDocumentos();

    public String gerarResumo() {
        return String.format("""
                === RESUMO DA APÓLICE ===
            Número: %s
            Segurado: %s
            Data de Emissão: %s
            Prêmio Mensal: R$ %.2f
            Documentos Exigidos: %s
            =========================
            """, numeroApolice, nomeSegurado, dataEmissao, premioMensal, String.join(", ", documentosExigidos));
    }
}
