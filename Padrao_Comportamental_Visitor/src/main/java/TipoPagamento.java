
public class TipoPagamento implements Compra {

    private String formaPagamento;
    private int numeroParcelasMaximas;

    private int numeroParcelasMinimas;

    public TipoPagamento(String formaPagamento, int numeroParcelasMaximas, int numeroParcelasMinimas) {
        this.formaPagamento = formaPagamento;
        this.numeroParcelasMaximas = numeroParcelasMaximas;
        this.numeroParcelasMinimas = numeroParcelasMinimas;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public int getNumeroParcelasMaximas() {
        return numeroParcelasMaximas;
    }

    public int getNumeroParcelasMinimas() {
        return numeroParcelasMinimas;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirTipoPagamento(this);
    }
}
