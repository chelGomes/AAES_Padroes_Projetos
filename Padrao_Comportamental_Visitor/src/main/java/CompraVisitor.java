public class CompraVisitor implements Visitor{
    public String exibir(Compra compra){
        return compra.aceitar(this);
    }

    @Override
    public String exibirProduto(Produto produto) {
        return "Produto{" +
                "nomeProduto=" + produto.getNomeProduto() +
                ", preco='" + produto.getPreco() +
                '}';
    }

    @Override
    public String exibirPedido(Pedido pedido) {
        return "Pedido{" +
                "numeroPedido=" + pedido.getNumeroPedido() +
                ", itens='" + pedido.getItens() +
                '}';
    }

    @Override
    public String exibirEntrega(Entrega entrega) {
        return "Entrega{" +
                "nomeCliente=" + entrega.getNomeCliente() +
                ", precoFrete='" + entrega.getPrecoFrete() + '\'' +
                ", descricao=" + entrega.getDescricao() +
                '}';
    }

    @Override
    public String exibirTipoPagamento(TipoPagamento tipoPagamento) {
        return "TipoPagamento{" +
                "formaPagamento=" + tipoPagamento.getFormaPagamento() +
                ", numeroParcelasMaximas='" + tipoPagamento.getNumeroParcelasMaximas() + '\'' +
                ", numeroParcelasMinimas=" + tipoPagamento.getNumeroParcelasMinimas() +
                '}';
    }
}
