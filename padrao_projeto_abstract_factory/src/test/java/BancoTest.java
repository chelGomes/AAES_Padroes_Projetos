import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BancoTest {
    @Test
    public void deveEmitirCartaoContaCorrente() {
        FabricaAbstrataBanco fabrica = new FabricaContaCorrente();
        Banco banco = new Banco(fabrica);
        assertEquals("Cartao conta corrente", banco.emitirCartao());
    }

    @Test
    public void deveEmitirCartaoContaPoupanca() {
        FabricaAbstrataBanco fabrica = new FabricaContaPoupanca();
        Banco banco = new Banco(fabrica);
        assertEquals("Cartao conta poupanca", banco.emitirCartao());
    }

    @Test
    public void deveExpedirContaCorrente() {
        FabricaAbstrataBanco fabrica = new FabricaContaCorrente();
        Banco banco = new Banco(fabrica);
        assertEquals("Conta Corrente", banco.expedirConta());
    }

    @Test
    public void deveExpedirContaPoupanca() {
        FabricaAbstrataBanco fabrica = new FabricaContaPoupanca();
        Banco banco = new Banco(fabrica);
        assertEquals("Conta Poupanca", banco.expedirConta());
    }
}
