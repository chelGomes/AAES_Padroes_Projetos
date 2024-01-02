import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitarEmprestimoTest {
    FuncionarioPresidente presidente;
    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioAtendente atendente;


    @BeforeEach
    public void setUp() {
        presidente = new FuncionarioPresidente(null);
        diretor = new FuncionarioDiretor(presidente);
        gerente = new FuncionarioGerente(diretor);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    public void deveRetornarAtendenteParaAssinaturaEmprestimoBoleto() {
        assertEquals("Sem assinatura do emprestimo", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoBoleto.getTipoEmprestimoBoleto())));
    }

    @Test
    public void deveRetornarGerenteParaAssinaturaEmprestimoConsignado() {
        assertEquals("Sem assinatura do emprestimo", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoConsignado.getTipoEmprestimoConsignado())));
    }

    @Test
    public void deveRetornarDiretorParaAssinaturaEmprestimoPessoal() {
        assertEquals("Sem assinatura do emprestimo", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoPessoal.getTipoEmprestimoPessoal())));
    }

    @Test
    public void deveRetornarPresidenteParaAssinaturaEmprestimoFinanciamento() {
        assertEquals("Sem assinatura do emprestimo", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoFinanciamento.getTipoEmprestimoFinanciamento())));
    }

    @Test
    public void deveRetornarSemAssinaturaParaAssinaturaBoleto() {
        assertEquals("Sem assinatura do emprestimo", atendente.assinarEmprestimo(new SolicitarEmprestimo(TipoEmprestimoBoleto.getTipoEmprestimoBoleto())));
    }

}
