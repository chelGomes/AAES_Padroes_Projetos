import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraVisitorTeste {
    @Test
    void deveExibirProduto() {
        Produto produto = new Produto("notebook", 2000);

        CompraVisitor visitor = new CompraVisitor();
        assertEquals("Produto{nomeProduto=notebook, preco='2000.0}", visitor.exibir(produto));
    }

    @Test
    void deveExibirEntrega() {
        Entrega entrega = new Entrega("Joao", 15, "aparelho eletronico");
        entrega.getDescricao();

        CompraVisitor visitor = new CompraVisitor();
        assertEquals("Entrega{nomeCliente=Joao, precoFrete='15.0, descricao=aparelho eletronico}", visitor.exibir(entrega));
    }

    @Test
    void deveExibirTipoPagamento() {
        TipoPagamento tipoPagamento = new TipoPagamento("cartao", 9, 2);

        CompraVisitor visitor = new CompraVisitor();
        assertEquals("TipoPagamento{formaPagamento=cartao, numeroParcelasMaximas='9', numeroParcelasMinimas=2}", visitor.exibir(tipoPagamento));
    }
}
