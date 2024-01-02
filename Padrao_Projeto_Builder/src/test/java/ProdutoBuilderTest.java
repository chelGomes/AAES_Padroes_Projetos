import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProdutoBuilderTest {

    @Test
    void deveRetornarExcecaoParaProdutoSemNome() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setCodigoProduto(1)
                    .setPrecoProduto(10.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome do produto inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaProdutoSemCodigo() {
        try {
            ProdutoBuilder produtoBuilder = new ProdutoBuilder();
            Produto produto = produtoBuilder
                    .setNomeProduto("Produto 1")
                    .setPrecoProduto(10.0)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Codigo do produto invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarProdutoValido() {
        ProdutoBuilder produtoBuilder = new ProdutoBuilder();
        Produto produto = produtoBuilder
                .setCodigoProduto(1)
                .setNomeProduto("Produto 1")
                .setPrecoProduto(10.0)
                .build();

        assertNotNull(produto);
    }
}
