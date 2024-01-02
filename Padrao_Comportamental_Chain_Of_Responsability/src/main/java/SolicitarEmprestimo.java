public class SolicitarEmprestimo {
    private TipoEmprestimo tipoEmprestimo;

    public SolicitarEmprestimo(TipoEmprestimo tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
    }

    public SolicitarEmprestimo(TipoEmprestimoBoleto tipoEmprestimoBoleto) {
    }

    public SolicitarEmprestimo(TipoEmprestimoConsignado tipoEmprestimoConsignado) {
    }

    public SolicitarEmprestimo(TipoEmprestimoPessoal tipoEmprestimoPessoal) {
    }

    public SolicitarEmprestimo(TipoEmprestimoFinanciamento tipoEmprestimoFinanciamento) {
    }

    public TipoEmprestimo getTipoEmprestimo(){
        return tipoEmprestimo;
    }

    public void setTipoEmprestimo(TipoEmprestimo tipoEmprestimo){
        this.tipoEmprestimo = tipoEmprestimo;
    }
}
