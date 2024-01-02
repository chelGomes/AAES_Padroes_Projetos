public class ProdutoBuilder {
    private  Produto produto;

    ProdutoBuilder(){
        produto = new Produto();
    }

    public Produto build(){
        if (produto.getPrecoProduto() == 0.0) {
            throw new IllegalArgumentException("Preco do produto invalido");
        }
        if (produto.getNomeProduto().equals("")) {
            throw new IllegalArgumentException("Nome do produto inválido");
        }
        if(produto.getCodigoProduto() == 0){
            throw  new IllegalArgumentException("Codigo do produto invalido");
        }
        return produto;
    }

    public ProdutoBuilder setPrecoProduto(double precoProduto) {
        produto.setPrecoProduto(precoProduto);
        return this;
    }

    public ProdutoBuilder setNomeProduto(String nomeProduto) {
        produto.setNomeProduto(nomeProduto);
        return this;
    }

    public ProdutoBuilder setDescricaoProduto(String descricaoProduto) {
        produto.setDescricaoProduto(descricaoProduto);
        return this;
    }

    public ProdutoBuilder setNomeFabricante(String nomeFabricante) {
        produto.setNomeFabricante(nomeFabricante);
        return this;
    }

    public ProdutoBuilder setQuantidadeEstoqueProduto(int quantidadeEstoqueProduto) {
        produto.setQuantidadeEstoqueProduto(quantidadeEstoqueProduto);
        return this;
    }

    public ProdutoBuilder setCodigoProduto(int codigoProduto) {
        produto.setCodigoProduto(codigoProduto);
        return this;
    }
}
