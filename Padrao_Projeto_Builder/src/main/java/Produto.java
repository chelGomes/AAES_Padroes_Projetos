public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String descricaoProduto;
    private String nomeFabricante;
    private int quantidadeEstoqueProduto;
    private int codigoProduto;


    public Produto(){
        this.nomeProduto = "";
        this.precoProduto = 0.0;
        this.descricaoProduto = "";
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFabricante() {
        return nomeFabricante;
    }

    public void setNomeFabricante(String nomeFabricante) {
        this.nomeFabricante = nomeFabricante;
    }

    public int getQuantidadeEstoqueProduto() {
        return quantidadeEstoqueProduto;
    }

    public void setQuantidadeEstoqueProduto(int quantidadeEstoqueProduto) {
        this.quantidadeEstoqueProduto = quantidadeEstoqueProduto;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
}
