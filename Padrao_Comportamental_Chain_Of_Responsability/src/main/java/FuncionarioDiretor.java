public class FuncionarioDiretor extends Funcionario {
    public FuncionarioDiretor(Funcionario superior) {
        listaEmprestimos.add(TipoEmprestimoPessoal.getTipoEmprestimoPessoal());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
