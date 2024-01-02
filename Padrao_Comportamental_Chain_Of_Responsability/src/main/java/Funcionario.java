import java.util.ArrayList;

public abstract class Funcionario {
    protected ArrayList listaEmprestimos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarEmprestimo(SolicitarEmprestimo solicitarEmprestimo) {
        if (listaEmprestimos.contains(solicitarEmprestimo.getTipoEmprestimo())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.assinarEmprestimo(solicitarEmprestimo);
            }
            else
            {
                return "Sem assinatura do emprestimo";
            }
        }
    }
}
