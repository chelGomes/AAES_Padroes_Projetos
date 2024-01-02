public class FuncionarioPresidente extends Funcionario {
    public FuncionarioPresidente(Funcionario superior) {
        listaEmprestimos.add(TipoEmprestimoFinanciamento.getTipoEmprestimoFinanciamento());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Presidente";
    }
}
