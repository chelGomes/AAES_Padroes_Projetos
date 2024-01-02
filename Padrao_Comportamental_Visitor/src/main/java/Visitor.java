public interface Visitor {
    String exibirProduto(Produto produto);
    String exibirEntrega(Entrega entrega);
    String exibirPedido(Pedido pedido);
    String exibirTipoPagamento(TipoPagamento tipoPagamento);

}
