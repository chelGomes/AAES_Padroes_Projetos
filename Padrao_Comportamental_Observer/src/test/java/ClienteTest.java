import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {
   @Test
    public void deveNotificarUmCliente() {
        Produto produto = new Produto("Smartwatch", 300, "relogio digital", "10");
        Cliente cliente = new Cliente("Joana", "av independencia");
        produto.lancarProduto(cliente);
        assertEquals("Cliente Joana,{nomeProduto='Smartwatch', preco='300', descricao='relogio digital', codigo='10'}", cliente.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarCliente(Cliente cliente) {
        Produto produto = new Produto("PlayStation 5 (PS5)", 3000, "videogame", "110");
        Cliente cliente1 = new Cliente("Joao","rua rui barbosa");
        Cliente cliente2 = new Cliente("Jose","av andradas");
        cliente1.cadastrar(produto);
        cliente2.cadastrar(produto);
        produto.lancarProduto(cliente);
        assertEquals("Cliente 1, produto reservado {nomeProduto=PlayStation 5 (PS5), preco='3000', descricao='videogaeame', codigo='110'}", cliente1.getUltimaNotificacao());
        assertEquals("Cliente 2, produto reservado {nomeProduto=PlayStation 5 (PS5), preco='3000', descricao='videogaeame', codigo='110'}", cliente2.getUltimaNotificacao());
    }

    @Test
    public void naoDeveNotificarCliente() {
        Produto produto = new Produto("Smartphone", 2500, "aparelho celular", "100");
        Cliente cliente = new Cliente("Joao","av getulio vargas");
        produto.lancarProduto(cliente);
        assertEquals(null, cliente.getUltimaNotificacao());
    }

    @Test
    public void deveNotificarClientePrime(Cliente cliente) {
        Produto prime1 = new Produto("iPhone 13 Pro", 4000, "Smartphones", "500");
        Produto prime2 = new Produto("Apple Watch Series 7", 3500, "Smartwatches", "477");
        Cliente cliente1 = new Cliente("Alex","av rio branco");
        Cliente cliente2 = new Cliente("Maria","rua sao mateus");
        cliente1.cadastrar(prime1);
        cliente2.cadastrar(prime2);
        prime1.lancarProduto(cliente);
        assertEquals("Prime 1, produto prime reservado{nomeProduto=iPhone 13 Pro, preco='4000', descricao='Smartphones', codigo='500'}", cliente1.getUltimaNotificacao());
        assertEquals(null, cliente2.getUltimaNotificacao());
    }
}
