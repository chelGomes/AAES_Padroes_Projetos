public class FuncionarioAtendente extends Funcionario{
    public FuncionarioAtendente(Funcionario superior) {
        listaEmprestimos.add(TipoEmprestimoBoleto.getTipoEmprestimoBoleto());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Atendente";
    }
}
