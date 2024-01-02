public class FuncionarioGerente extends Funcionario {
    public FuncionarioGerente(Funcionario superior) {
        listaEmprestimos.add(TipoEmprestimoConsignado.getTipoEmprestimoConsignado());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
