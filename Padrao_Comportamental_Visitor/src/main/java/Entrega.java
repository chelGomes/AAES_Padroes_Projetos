public class Entrega implements Compra{
    private String nomeCliente;
    private double precoFrete;
    private String descricao;

    public Entrega(String nomeCliente, double precoFrete, String descricao) {
        this.nomeCliente = nomeCliente;
        this.precoFrete = precoFrete;
        this.descricao = descricao;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getPrecoFrete() {
        return precoFrete;
    }

    public String getDescricao() {
        return descricao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirEntrega(this);
    }
}
