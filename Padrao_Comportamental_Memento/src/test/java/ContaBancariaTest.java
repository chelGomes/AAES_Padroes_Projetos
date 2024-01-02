import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContaBancariaTest {
    @Test
    void deveArmazenarEstados() {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setEstado(ContaBancariaEstadoAtiva.getInstance());
        assertEquals(1, contaBancaria.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setEstado(ContaBancariaEstadoEncerrada.getInstance());
        contaBancaria.setEstado(ContaBancariaEstadoTransferida.getInstance());
        contaBancaria.restauraEstado(0);
        assertEquals(ContaBancariaEstadoEncerrada.getInstance(), contaBancaria.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setEstado(ContaBancariaEstadoAtiva.getInstance());
        contaBancaria.setEstado(ContaBancariaEstadoCongelada.getInstance());
        contaBancaria.setEstado(ContaBancariaEstadoEncerrada.getInstance());
        contaBancaria.setEstado(ContaBancariaEstadoTransferida.getInstance());
        contaBancaria.restauraEstado(2);
        assertEquals(ContaBancariaEstadoEncerrada.getInstance(), contaBancaria.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            ContaBancaria contaBancaria = new ContaBancaria();
            contaBancaria.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Indice invalido", e.getMessage());
        }
    }
}
